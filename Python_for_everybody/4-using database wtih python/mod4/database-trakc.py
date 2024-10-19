import sqlite3
import csv

conn = sqlite3.connect('trackdb.sqlite')
cur = conn.cursor()

# Limpiar tablas si ya existen para evitar duplicados
cur.executescript('''
DROP TABLE IF EXISTS Artist;
DROP TABLE IF EXISTS Genre;
DROP TABLE IF EXISTS Album;
DROP TABLE IF EXISTS Track;
''')

# creo las tablas a usar
cur.executescript('''
CREATE TABLE Artist (
    id  INTEGER PRIMARY KEY,
    name    TEXT UNIQUE
);

CREATE TABLE Genre (
    id  INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
    name    TEXT UNIQUE
);

CREATE TABLE Album (
    id  INTEGER PRIMARY KEY,
    artist_id  INTEGER,
    title   TEXT UNIQUE
);

CREATE TABLE Track (
    id  INTEGER PRIMARY KEY,
    title TEXT  UNIQUE,
    album_id  INTEGER,
    genre_id  INTEGER,
    len INTEGER, rating INTEGER, count INTEGER
);
''')

handle = open('tracks.csv')

# Another One Bites The Dust,Queen,Greatest Hits,55,100,217103
#   0                          1      2           3  4   5

for line in handle:
    line = line.strip()
    pieces = line.split(',')
    if len(pieces) < 7 : continue

    name = pieces[0]
    artist = pieces[1]
    album = pieces[2]
    count = pieces[3]
    rating = pieces[4]
    length = pieces[5]
    genre = pieces[6]

    #print(name, artist, album, count, rating, length, genre)

    cur.execute('''INSERT OR IGNORE INTO Artist (name) 
        VALUES ( ? )''', ( artist, ) )
    cur.execute('SELECT id FROM Artist WHERE name = ? ', (artist, ))
    artist_id = cur.fetchone()[0]

    cur.execute('''INSERT OR IGNORE INTO Album (title, artist_id) 
        VALUES ( ?, ? )''', ( album, artist_id ) )
    cur.execute('SELECT id FROM Album WHERE title = ? ', (album, ))
    album_id = cur.fetchone()[0]

    cur.execute('''INSERT OR IGNORE INTO Genre (name) 
            VALUES ( ? )''', (genre,))
    cur.execute('SELECT id FROM Genre WHERE name = ? ', (genre,))
    genre_id = cur.fetchone()[0]

    cur.execute('''INSERT OR REPLACE INTO Track
        (title, album_id,genre_id, len, rating, count) 
        VALUES ( ?, ?, ?, ?, ?,? )''', 
        ( name, album_id, genre_id , length, rating, count ) )

    conn.commit()

# Guardar cambios
conn.commit()

print('terminao')
sqlstr = '''
SELECT Track.title, Artist.name, Album.title, Genre.name 
    FROM Track JOIN Genre JOIN Album JOIN Artist 
    ON Track.genre_id = Genre.ID 
    AND Track.album_id = Album.id 
    AND Album.artist_id = Artist.id
    ORDER BY Artist.name LIMIT 3
'''

# Imprimir directamente para verificar si hay resultados
rows = cur.execute(sqlstr).fetchall()
print(f"Resultados obtenidos: {len(rows)}")
for row in rows:
    print(row)

# Cerrar conexión
cur.close()
conn.close()
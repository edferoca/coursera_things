import urllib.request, urllib.parse, urllib.error #librerias para estraer info de pag web
import json #libreria para leer archivos json
import ssl  #certificados SSL


# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

url = input('introdusca la url: ')
uh = urllib.request.urlopen(url, context=ctx)
data = uh.read().decode()


#traspasa el json a python
datos = json.loads(data)


#procesamiento de los datos en el json
cuanta_arranque = 0
for valores in range(len(datos['comments'])):
    cuanta_arranque = datos['comments'][valores]['count']+ cuanta_arranque

#precentacion de datos
print('recuperando', url)
print('recuperados', len(data), 'caracteres')
print('cuenta', len(datos['comments']))
print('suma', cuanta_arranque)
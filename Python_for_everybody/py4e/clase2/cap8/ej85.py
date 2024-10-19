#fname = input("Enter file name: ")
fh = open('mbox-short.txt')
palabras=list()
count=0
for line in fh:
    #pregunta si  alguna linea del texto empiesa por  la palabra From
    if not line.startswith("From ") : continue
    #elimina los saltos de linea inecesarios
    line =line.rstrip()
    #conbierte a lista
    palabras=line.split()
    print(palabras[1])
    count=count+1

print("There were", count, "lines in the file with From as the first word")

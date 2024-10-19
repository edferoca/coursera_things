#fname = input("Enter file name: ")
#if len(fname) < 1 : fname = "mbox-short.txt"
fh = open('mbox-short.txt')
palabras=list()
email=dict()
for line in fh:
    #pregunta si  alguna linea del texto empiesa por  la palabra From
    if not line.startswith("From ") : continue
    #elimina los saltos de linea inecesarios
    line =line.rstrip()
    #conbierte a lista
    palabras=line.split()
    email[palabras[1]]=email.get(palabras[1],0)+1

llavegrande=None
cuentagrande=None
for llave,cuenta in email.items():
    if cuentagrande is None or cuenta > cuentagrande:
        llavegrande=llave
        cuentagrande=cuenta


print(llavegrande,cuentagrande)

#fname = input("Enter file name: ")
fh = open('romeo.txt')
palabras=list()
num = 0

for line in fh:
    #quita los saltos de renglon
    line=line.rstrip()
    #convierte a una lista
    renglon=line.split()
    #por cada plaabra en cada renglon revisa si esa palabra ya esta en la nueva
    #lista, si no la pone en esa lista
    for palabra in renglon:
        if palabra in palabras : continue
        else:palabras.append(palabra)
    #coloca en orden alfavetico
    palabras.sort()
print(palabras)

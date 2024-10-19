import re
#fname = input("Enter file name: ")
#if len(fname) < 1 : fname = "mbox-short.txt"
fh = open('regex_sum_765251.txt')
listanumeros=list()
suma = 0
for line in fh:
    #elimina los saltos de linea inecesarios
    line =line.rstrip()

    # en numeros (cadena)quedan todos los numeros que hay en cada renglon (line)
    numeros=re.findall('([0-9]+)',line)
    #pasa cada  numero encontrado a la cadena listanumeros
    for num in numeros:
        num=int(num)
        listanumeros.append(num)
#suma los numeros en listanumeros
for num in listanumeros:
    if  suma == 0:
        suma=num
    else : suma=suma+ num

print(suma)

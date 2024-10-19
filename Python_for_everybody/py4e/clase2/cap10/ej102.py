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
    #escoje la casilla dodne estan la hora de envio
    horas=palabras[5]
    #separa las horas de los minutos y seg
    hora=horas.split(':')
    #arma el directorio emal
    email[hora[0]]=email.get(hora[0],0)+1

#creo una lista temporal para organisar e imprimir los datos
temporal=list()
#llena la lista con la hora y las repeticiones del directorio
for v,k in email.items():
    valor=(v,k)
    temporal.append(valor)
#organisa la lista en orden decendiente
temporal=sorted(temporal)
#imprime como es requerido en el ejercico
for v,k  in temporal:
    print(v,k)

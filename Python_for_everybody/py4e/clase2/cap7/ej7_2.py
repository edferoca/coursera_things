#fname = input("Enter file name: ")
fh = open('mbox-short.txt')
count = 0
num = 0

for line in fh:
    if not line.startswith("X-DSPAM-Confidence:") : continue
    count=count+1
    findnum=line.find('0')
    numero=line[findnum:]
    numero=float(numero)
    num=num+numero



print("Average spam confidence: " ,num/count)

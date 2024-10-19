fname = input("Enter file name: ")
fh = open('words.txt')

for line in fh:
    line =line.rstrip()
    print(line)

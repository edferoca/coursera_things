# To run this, download the BeautifulSoup zip file
# http://www.py4e.com/code3/bs4.zip
# and unzip it in the same directory as this file

#utiliso libreria para url
from urllib.request import urlopen
#utilizo BeautifulSoup para hacer mas facil el recorere pag internet
from bs4 import BeautifulSoup
import ssl

listanumeros=list()

# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

url = input('Enter - ')
html = urlopen(url, context=ctx).read()
soup = BeautifulSoup(html, "html.parser")

# Retrieve all of the anchor tags
tags = soup('span')

for tag in tags:
    #tag.contents es una parte de los tag de html
    for num in tag.contents:
        num=int(num)
        listanumeros.append(num)

suma = 0
for num in listanumeros:
    if  suma == 0:
        suma=num
    else : suma=suma+ num

print(suma)

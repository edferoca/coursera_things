# To run this, download the BeautifulSoup zip file
# http://www.py4e.com/code3/bs4.zip
# and unzip it in the same directory as this file

import urllib.request, urllib.parse, urllib.error
from bs4 import BeautifulSoup
import ssl

# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

#url = input('Enter - ')
#count = input('Enter - ')
#position=input('Enter - ')

url = 'http://py4e-data.dr-chuck.net/known_by_Kyler.html'
count = 7
position=18

position=position-1

listacontactos=list()

for i in range(count):
    html = urllib.request.urlopen(url, context=ctx).read()
    listacontactos[:]=[]
    soup = BeautifulSoup(html, 'html.parser')
    tags = soup('a')
    for tag in tags:
        listacontactos.append(tag.get('href', None))
    url=listacontactos[position]


print('Retrieving: ',listacontactos[position])

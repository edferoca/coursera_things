import urllib.request, urllib.parse, urllib.error #librerias para estraer info de pag web
import xml.etree.ElementTree as ET #libreria para leer archivos XML
import ssl  #certificados SSL

# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE


url = input('introdusca la url: ')
print('recuperando', url)
uh = urllib.request.urlopen(url, context=ctx)
data = uh.read()

print('recuperados', len(data), 'caracteres')
#traspasa el arbol a python
arbol = ET.fromstring(data)
#encuentra todas las etiquetas de count
results = arbol.findall('.//count')
#siclo for para contar los numeros
cuanta_arranque = 0
for cuenta in range(len(results)):
    cuanta_arranque = float(results[cuenta].text) + cuanta_arranque
print('cuanta', len(results))
print('suma', cuanta_arranque)
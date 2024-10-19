text = "X-DSPAM-Confidence:    0.8475";
hallar=text.find('0')
num=text[hallar:]
num=float(num)
print(num)

from flask import Flask,  request, make_response, redirect, render_template

#instancio el termino FLask que esta dirigido al archivo, en este caso al main.py (__name__)
app = Flask(__name__)
items=["elemtno 1", "elemento 2", "elemento 3"]

#url que puntan a objetos (llamados de funcion) python  y que seran vistos por el cliente

#decorador de error
@app.errorhandler(404)
def not_found_endpoint(error):
    return render_template('404.html', error=error)

#decorado de Flask que apunta a la funcion hello  // endopoint
@app.route("/index")
#funcion hello
def index():
    user_ip_info = request.remote_addr
    #Construir objeto repsuesta
    respuesta = make_response(redirect("/show_inf_addres"))
    respuesta.set_cookie("user_ip_info" ,  user_ip_info)
    return respuesta 



@app.route("/show_inf_addres")
def show_information():
    user_ip = request.cookies.get("user_ip_info")
    context = {
        "user_ip" : user_ip,
        "lista" : items
    }
    return render_template("ip_information.html", **context) #desempaca todos los elemntos del diccionario context


#corro la app creada, el host permite que cualquiera lo lea y estara visible
#en el puerto 32
app.run(host='0.0.0.0', port=32, debug=True)
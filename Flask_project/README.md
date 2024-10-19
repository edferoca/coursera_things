# Proyecto Flask con Entorno Virtual

Este proyecto utiliza un entorno virtual para gestionar las dependencias de Python de forma aislada. A continuación se explican los pasos para crear, activar y utilizar el entorno virtual, así como para instalar las dependencias a partir de un archivo llamado `requirements.py`.

## Requisitos Previos

Asegúrate de tener instalado **Python 3** en tu sistema. Puedes verificarlo ejecutando:

```bash
python --version


# Crear el entorno virtual
python -m venv flask-venv

# Activar el entorno virtual (Windows)
flask-venv\Scripts\activate
# Activar el entorno virtual (Linux/macOS)
source flask-venv/bin/activate

# Instalar dependencias desde el archivo de requerimientos
pip install -r requerimientos.txt





# Volver a la carpeta principal del proyecto
cd ..

# Desactivar el entorno virtual
deactivate

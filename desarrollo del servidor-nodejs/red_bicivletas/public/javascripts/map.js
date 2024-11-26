// creo una variable direccionada al mapa y  lo pociciono en unas cordenadas especificas
var map = L.map('map').setView([51.505, -0.09], 13);

//colocamos una capa de mapa
L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {
    maxZoom: 19,
    attribution: '&copy; <a href="http://www.openstreetmap.org/copyright">OpenStreetMap</a>'
}).addTo(map);
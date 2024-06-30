//ejercicio 1 - Calcular estacon
let mes = 10;
let estacion

if (mes == 1 || mes == 2 || mes == 12) {
    estacion = "Verano"; 
}
else if (mes == 3 || mes == 4 || mes == 5) {
    estacion = "Otono";
}
else if (mes == 6 || mes == 7 || mes == 8) {
    estacion = "Invierno";
}
else if (mes == 9 || mes == 10 || mes == 11) {
    estacion = "Primavera";
}
else {
    estacion = "Valor Incorrecto"
}

console.log("El valor corresponde a la estacion: " + estacion); //El Valor corresponde a la: Primavera

//Ejercicio 2: 

let horaDia = 12;
let mensajes;

if (horaDia >= 6 && horaDia <= 11) {
    mensajes = "Buenas Mananas";
}
else if (horaDia >= 12 && horaDia <= 16) {
    mensajes = "Buenos Dias";
}
else if (horaDia >= 17 && horaDia <= 19) {
    mensajes = "Buenos Tardes";
}
else if (horaDia >= 20 && horaDia <= 23) {
    mensajes = "Buenos Noches";
}
else {
    mensajes = "Valor Incorrecto";
}

console.log(mensajes); //Buenos Dias
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
//Encontrar Numeros Pares E Impares
let parInpar = 10;
if (parInpar %2 == 0) {
    console.log("Es un numero PAR");
}
else {
    console.log("Es un numero IMPAR")
}

//Ejercicio: Es mayor de edad
let edad = 18, adulto = 18;
if (edad >= adulto) {
    console.log("Usted es una persona Adulta");
}
else {
    console.log("Usted Es una persona Menor de Edad");
}

//Ejercicio: Dentro de un rango
let dentroRango = 10;
let valMin = 0, valMax = 10;

if (dentroRango >= valMin && dentroRango <= valMax) {
    console.log("Esta dentro del rando Establecido")
}
else {
    console.log("Esta Fuera del rando Establecido")
}

//Ejercicio: Si el padre puede asister donde su hijo
let vacaciones = false, diaDescanso = false;
if (vacaciones || diaDescanso) {
    console.log("El padre puede asistir")
}
else{
    console.log("El padre NO puede asistir")
}
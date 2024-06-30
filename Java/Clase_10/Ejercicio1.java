package Java.Clase_10;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite un mes del ano: ");
        var mes = Integer.parseInt(entrada.nextLine());
        var estacion = "Estacion desconocida";

        if (mes == 1 || mes == 2 || mes == 3) {
            estacion = "Verano";
        }
        else if  (mes == 4 || mes == 5 || mes == 6) {
            estacion = "otono";
        }
        else if  (mes == 7 || mes == 8 || mes == 9) {
            estacion = "Invierno";
        }
        else if  (mes == 10 || mes == 11 || mes == 12) {
            estacion = "Primavera";
        }

        System.out.println("La estacio es =: " + estacion);

    }
}

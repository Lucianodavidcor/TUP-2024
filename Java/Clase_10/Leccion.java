package Java.Clase_10;

import java.util.Scanner;

public class Leccion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean condicion = false;

        if (condicion) {
            System.out.println("Condicion Verdadera"); //Condicion Simple
        }
        else {
            System.out.println("Condicion Falso"); // condicion Doble
        }

        var numero = 2;
        var numeroTexto = "Numero Desconocido";

        if (numero == 1) {
            numeroTexto = "Numero Uno";
        }
        else if (numero == 2) {
            numeroTexto = "Numero Dos";
        }
        else if (numero == 3) {
            numeroTexto = "Numero Tres";
        }
        else if (numero == 4) {
            numeroTexto = "Numero Cuatro";
        }
        else {
            numeroTexto = "Numero no Encontrado";
        }

        System.out.println("NumeroTexto = " + numeroTexto);

    }
}

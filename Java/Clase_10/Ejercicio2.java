package Java.Clase_10;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite Un numero de Mes: ");
        var mes  = Integer.parseInt(entrada.nextLine());
        var estacio = "Estacion Desconocida";

        switch (mes) {
            case 1: case 2: case 3:
                estacio = "Verano";
                break;
        
            case 4: case 5: case 6:
                estacio = "Otono";
                break;

            case 7: case 8: case 9:
                estacio = "Invierno";
                break;

            case 10: case 11: case 12:
                estacio = "Primavera";
                break;
        }

        System.out.println("La estacion Coresponde a: " + estacio);

    }
}

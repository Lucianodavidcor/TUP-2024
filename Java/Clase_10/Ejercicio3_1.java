package Java.Clase_10;

import java.util.Scanner;

public class Ejercicio3_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un Numero entre 0 y 10: ");
        var calificaciones = Integer.parseInt(entrada.nextLine());

        switch (calificaciones) {
            case 10: case 9:
                System.out.println("A");
                break;
            case 8: case 7:
                System.out.println("B");
                break;
            case 6: case 5:
                System.out.println("C");
                break;
            case 4: case 3:
                System.out.println("D");
                break;
            case 2: case 1: case 0:
                System.out.println("F");
                break;
                
        }
    }
}

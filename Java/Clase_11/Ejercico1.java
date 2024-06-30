package Java.Clase_11;

import java.util.Scanner;

public class Ejercico1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1,nota2,nota3,promedio;

        System.out.println("Digite la Primera Calificacion: ");
        nota1 = input.nextDouble();

        System.out.println("Digite la Primera Calificacion: ");
        nota2 = input.nextDouble();

        System.out.println("Digite la Primera Calificacion: ");
        nota3 = input.nextDouble();

        promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 7) {
            System.out.println("El Alumno esta APROBADO con un Promedio de: " + promedio);
        }
        else {
            System.out.println("El Alumno esta DESAPROBADO con un Promedio de: " + promedio);
        }

    }
    
}

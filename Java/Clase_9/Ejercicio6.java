package Java.Clase_9;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float guillermo, luis, juan, total;

        System.out.println("Digite la cantidad de dinero de guillermo: ");
        guillermo = Float.parseFloat(entrada.nextLine());

        luis = guillermo / 2;
        juan = (luis + guillermo) / 2;
        total = luis + guillermo + juan;

        System.out.println("\nEl dinero de luis es: U$D" + luis);
        System.out.println("El dinero de Juan es: U$D" + juan);
        System.out.println("El Total de Dinero entre los tres es: U$D" + total);
    }
}

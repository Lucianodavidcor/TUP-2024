package Java.Clase_11;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double compra,descuento,precioFinal;

        System.out.println("Digite la cantidad a pagar: ");
        compra = entrada.nextDouble();

        if (compra > 100) {
            descuento = compra * 0.2;
            precioFinal = compra - descuento;

        }
        else {
            precioFinal = compra;
        }

        System.out.println("El Precio a PAGAR es: " + precioFinal);
    }
}

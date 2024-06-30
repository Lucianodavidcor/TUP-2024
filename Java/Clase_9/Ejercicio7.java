package Java.Clase_9;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int salario = 100;
        int comision = 150, venta;

        float salarioMensual,ventaCarro,porsVenta,totalPrecio;

        System.out.println("Digite la cantidad de carros vendidos: ");
        venta = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el Precio de un Carro: ");
        ventaCarro = Float.parseFloat(entrada.nextLine());

        comision *= venta;
        totalPrecio = ventaCarro * venta;
        porsVenta = totalPrecio * 0.05f;
        salarioMensual = salario + comision + porsVenta;

        System.out.println("\nEL salario Mensual es: " + salarioMensual);
    }
}

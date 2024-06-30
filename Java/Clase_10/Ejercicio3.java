package Java.Clase_10;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un Numero entre 0 y 10: ");
        var calificaciones = Integer.parseInt(entrada.nextLine());

        if (calificaciones >= 9 && calificaciones < 10) {

            System.out.println('A');
        } 
        else if (calificaciones >= 8 && calificaciones < 9) {
            System.out.println('B');
        }
        else if (calificaciones >= 7 && calificaciones < 8) {
            System.out.println('C');
                
        }
        else if (calificaciones >= 6 && calificaciones < 7) {
            System.out.println('D');
                
        }
        else if (calificaciones >= 0 && calificaciones < 6) {
            System.out.println('F');
                
        }
        else{
            System.out.println("Fuera de rango");
        }
    }
}

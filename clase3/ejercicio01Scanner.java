package clase3;

import java.util.Scanner;

public class ejercicio01Scanner {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ingresa  dos numeros, separados por un espacio:");
        double num1 = s.nextDouble();
        double num2 = s.nextDouble();

        double multiplicacion = num1 * num2;
        System.out.println("la multiplicacion es: " + multiplicacion);
     }
}

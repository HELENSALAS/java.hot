package clase3;

import java.util.Scanner;

public class ejercicio03Scanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ingresa la cantidad de pesetas:");
        double num1 = s.nextDouble();
        double multiplicacion = num1 * 0.00889 ;

        System.out.println("el cambio en euros es:" + multiplicacion);

    }
}

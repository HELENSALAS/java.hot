package clase5;

import java.util.Scanner;

public class ejercicio03Scanner {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        
        System.out.println("Introduce el valor de a:");
        double a = en.nextDouble();
        
        System.out.println("Introduce el valor de b:");
        double b = en.nextDouble();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("La ecuación tiene infinitas soluciones.");
            } else {
                System.out.println("La ecuación no tiene solución.");
            }
        } else {
            double x = -b / a;
            System.out.println("La solución de la ecuación es x = " + x);
        }
    }
}
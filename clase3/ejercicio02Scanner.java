package clase3;

import java.util.Scanner;

public class ejercicio02Scanner {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("ingresa la cantidad de euro:");
        double num1 = s.nextDouble();
    
        double multiplicacion = num1 * 4.10 ;
        System.out.println("la cantidad de soles es: " + multiplicacion);
     }
}
    

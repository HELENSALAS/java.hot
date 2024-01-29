package clase3;

import java.util.Scanner;

public class ejercicio04Scanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ingrese un dos numeros, separados en espacio:");
        double num1 = s.nextDouble();
        double num2 = s.nextDouble();
        double suma = num1 + num2;
        double resta = num1 - num2;
        double division = num1 / num2;
        double multiplicacion = num1 * num2;

        System.out.println("la suma es: " + suma);
        System.out.println("la resta es: " + resta);
        System.out.println("la division es: " + division);
        System.out.println("la multiplicacion es: " + multiplicacion);
    }
}

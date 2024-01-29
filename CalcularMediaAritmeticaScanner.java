

import java.util.Scanner;

public class CalcularMediaAritmeticaScanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ingresa tres numeros, separados en espacio:");
        double num1 = s.nextDouble();
        double num2 = s.nextDouble();
        double num3 = s.nextDouble();

        double media = (num1 + num2 + num3) / 3;

        System.out.println("la media es: " + media);

    }
}

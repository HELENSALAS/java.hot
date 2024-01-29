package clase3;

import java.util.Scanner;

public class ejercicio08Scanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ingrese un numero en megabytes");
        double num1 =s.nextDouble();
        double megabytes = num1 * 1000;

        System.out.println("el numero en kilobytes es:"+ megabytes);


    }
}

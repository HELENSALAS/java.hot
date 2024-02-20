package clase5;

 import java.util.Scanner;

public class ejercicio08Scanner {
   

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        
        System.out.println("Introduce un número entero:");
        int numero = en.nextInt();
        
        // Comprobar si el número es par
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número no es par.");
        }
        
        // Comprobar si el número es divisible entre 5
        if (numero % 5 == 0) {
            System.out.println("El número es divisible entre 5.");
        } else {
            System.out.println("El número no es divisible entre 5.");
        }
    }
}


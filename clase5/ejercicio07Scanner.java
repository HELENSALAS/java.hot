package clase5;
import java.util.Scanner;

public class ejercicio07Scanner {
    

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        
        System.out.println("Introduce el primer número:");
        int numero1 = en.nextInt();
        
        System.out.println("Introduce el segundo número:");
        int numero2 = en.nextInt();
        
        System.out.println("Introduce el tercer número:");
        int numero3 = en.nextInt();
        
        
        int temp;
        
        if (numero1 > numero2) {
            temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }
        
        if (numero2 > numero3) {
            temp = numero2;
            numero2 = numero3;
            numero3 = temp;
        }
        
        if (numero1 > numero2) {
            temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }
        
        System.out.println("Los números ordenados son:");
        System.out.println(numero1 + ", " + numero2 + ", " + numero3);
    }
}


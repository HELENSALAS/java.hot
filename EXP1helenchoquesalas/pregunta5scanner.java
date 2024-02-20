package EXP1helenchoquesalas;

import java.util.Scanner;

public class pregunta5scanner {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        int positivos = 0;
        int negativos = 0;
        
        System.out.println("Ingrese diez números:");
        
        for (int i = 0; i < 10; i++) {
            int numero = Scanner.nextInt();
            
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }
        
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
    }
}

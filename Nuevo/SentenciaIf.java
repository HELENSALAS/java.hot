package Nuevo;

import java.util.Scanner;

public class SentenciaIf {
    public static void main(String[] args) {
        System.out.println("Un número entero: ");
        Scanner s = new Scanner(System.in);
        int número = s.nextInt();

        if(número > 0) {
            System.out.println("El número "+número+" es positivo");
        }else{
            System.out.println("El número "+número+" es negativo");
        }
    }
}

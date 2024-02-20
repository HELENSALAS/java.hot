package Nuevo;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
         System.out.println("Ingrese la nota: ");
        Scanner s = new Scanner(System.in);
        int nota = s.nextInt();

        if(nota > 10.5) {
            System.out.println("La nota "+nota+" es APROVADO");
        }else{
            System.out.println("La nota "+nota+" es DESAPROVADO");
        }
    
    }
}

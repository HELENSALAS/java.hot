package clase5;

import java.util.Scanner;

public class ejercicio04Scanner {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        
        System.out.println("Introduce la primera nota:");
        double nota1 = en.nextDouble();
        
        System.out.println("Introduce la segunda nota:");
        double nota2 = en.nextDouble();
        
        System.out.println("Introduce la tercera nota:");
        double nota3 = en.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("La media de las tres notas es: " + media);
        
        if (media >= 0 && media <= 10) {
            System.out.println("Boletín: Insuficiente");
        } else if (media >= 11 && media <= 12) {
            System.out.println("Boletín: Suficiente");
        } else if (media >= 13 && media <= 15) {
            System.out.println("Boletín: Bien");
        } else if (media >= 16 && media <= 20) {
            System.out.println("Boletín: Notable o Sobresaliente");
        } else {
            System.out.println("Error: Las notas deben estar entre 0 y 20.");
        }
    }
}

package EXP1helenchoquesalas;

import java.util.Scanner;

public class pregunta3scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la altura (en metros): ");
        double altura = scanner.nextDouble();
        
        double gravedad = 9.8; // Asumimos la gravedad estándar en la Tierra
        
        double tiempo = Math.sqrt((2 * altura) / gravedad);
        
        System.out.println("El tiempo que tardará en caer el objeto es de " + tiempo + " segundos.");
    }
}

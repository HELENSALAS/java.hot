package clase3;

import java.util.Scanner;
   
public class ejercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la nota del primer examen: ");
        double notaPrimerExamen = scanner.nextDouble();

        System.out.print("Introduce la media deseada: ");
        double mediaDeseada = scanner.nextDouble();

        // Calcula la nota necesaria en el segundo examen
        double notaSegundoExamen = (mediaDeseada - (notaPrimerExamen * 0.4)) / 0.6;

        System.out.println("La nota necesaria en el segundo examen es: " + notaSegundoExamen);
    }
}

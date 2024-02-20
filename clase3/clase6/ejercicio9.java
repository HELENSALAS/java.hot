package clase3.clase6;


    import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        
        System.out.println("Número\tCuadrado\tCubo");
        
        for (int i = numero; i < numero + 5; i++) {
            int cuadrado = i * i;
            int cubo = i * i * i;
            System.out.println(i + "\t" + cuadrado + "\t\t" + cubo);
        }
        
        scanner.close();
    }
}


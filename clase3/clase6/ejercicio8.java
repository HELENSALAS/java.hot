package clase3.clase6;


    import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entero: ");
        long numero = scanner.nextLong();
        
        int contador = 0;
        
        // Si el número es negativo, se elimina el signo
        if (numero < 0) {
            numero = -numero;
        }
        
        // Se cuenta el número de dígitos utilizando un bucle while
        do {
            contador++;
            numero = numero / 10;
        } while (numero != 0);
        
        System.out.println("El número tiene " + contador + " dígitos.");
        
        scanner.close();
    }
}



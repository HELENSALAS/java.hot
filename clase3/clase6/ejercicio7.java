package clase3.clase6;


    import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        int combinacion = 1234; // Combinación de la caja fuerte
        int intentos = 4; // Número de intentos permitidos
        
        Scanner scanner = new Scanner(System.in);
        
        while (intentos > 0) {
            System.out.print("Introduce la combinación de 4 cifras: ");
            int entrada = scanner.nextInt();
            
            if (entrada == combinacion) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            } else {
                System.out.println("Lo siento, esa no es la combinación");
                intentos--;
            }
        }
        
        if (intentos == 0) {
            System.out.println("Has agotado todos los intentos. La caja fuerte permanece cerrada.");
        }
        
        scanner.close();
    }
}



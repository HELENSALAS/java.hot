package clase3.clase6;


    import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero y positivo: ");
        int numero = sc.nextInt();
        sc.close();
        
        if(numero < 0) {
            System.out.println("El número introducido no es válido. Debe ser positivo.");
            return;
        }
        
        int suma = 0;
        for(int i = numero + 1; i <= numero + 100; i++) {
            suma += i;
        }
        
        System.out.println("La suma de los 100 números siguientes a " + numero + " es: " + suma);
    }
}



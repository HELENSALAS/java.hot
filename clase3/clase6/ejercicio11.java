package clase3.clase6;


    import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        sc.close();
        
        boolean esPrimo = true;
        
        if(numero <= 1) {
            esPrimo = false;
        } else {
            for(int i = 2; i <= Math.sqrt(numero); i++) {
                if(numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        
        if(esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }
}



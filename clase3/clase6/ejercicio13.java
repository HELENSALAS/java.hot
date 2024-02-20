package clase3.clase6;


    import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número entero: ");
        int numero1 = sc.nextInt();
        System.out.print("Introduce el segundo número entero (distinto al primero): ");
        int numero2 = sc.nextInt();
        sc.close();
        
        if(numero1 == numero2) {
            System.out.println("Los números introducidos son iguales. Deben ser distintos.");
            return;
        }
        
        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);
        
        System.out.println("Los números enteros comprendidos entre " + menor + " y " + mayor + " son:");
        
        for(int i = menor; i <= mayor; i += 7) {
            System.out.println(i);
        }
    }
}



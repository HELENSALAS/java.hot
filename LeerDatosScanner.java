import java.util.Scanner;

public class LeerDatosScanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("ingrese tu nombre y edad, separados por un espacio:");
        String nombre = s.next();
        int edad = s.nextInt();
        System.out.println("hola " + nombre + " tu edad es " + edad);
    }
}

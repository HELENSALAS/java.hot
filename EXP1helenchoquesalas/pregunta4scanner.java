package EXP1helenchoquesalas;


import java.util.Scanner;

public class pregunta4scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        System.out.println("Ingrese su fecha de nacimiento (formato: dd/mm/aaaa):");
        String fechaNacimiento = scanner.nextLine();
        
        // Separar el día, mes y año de la fecha de nacimiento
        String[] partesFecha = fechaNacimiento.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]);
        int anio = Integer.parseInt(partesFecha[2]);
        
        // Verificar si la fecha es válida
        if (anio > 0 && mes >= 1 && mes <= 12 && dia >= 1 && dia <= 28) {
            // número mágico
            int sumaDigitos = sumarDigitos(dia) + sumarDigitos(mes) + sumarDigitos(anio);
            int numeroMagico = reducirADigito(sumaDigitos);
            
            // Mostrar el número mágico 
            System.out.println("El número mágico asociado a tu fecha de nacimiento es: " + numeroMagico);
        } else {
            System.out.println("La fecha ingresada no es válida.");
        }
    }
    
    
    public static int sumarDigitos(int numero) {
        int suma = 0;
        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
        }
        return suma;
    }
    
    // Función para reducir un número a un solo dígito
    public static int reducirADigito(int numero) {
        while (numero > 9) {
            numero = sumarDigitos(numero);
        }
        return numero;
    }
}
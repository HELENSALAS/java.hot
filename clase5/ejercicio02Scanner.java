package clase5;

import java.util.Scanner;
public class ejercicio02Scanner {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        System.out.println("Introduce el número de horas trabajadas:");
        int horasTrabajadas = en.nextInt();
        
        int salarioHora = 12; // Salario por hora ordinaria
        int salarioHoraExtra = 16; // Salario por hora extra
        int horasOrdinarias = 40; // Número de horas ordinarias
        
        int salarioSemanal = 0;
        
        if (horasTrabajadas <= horasOrdinarias) {
            salarioSemanal = horasTrabajadas * salarioHora;
        } else {
            int horasExtras = horasTrabajadas - horasOrdinarias;
            salarioSemanal = (horasOrdinarias * salarioHora) + (horasExtras * salarioHoraExtra);
        }
        
        System.out.println("El salario semanal del trabajador es: " + salarioSemanal + " soles");
    }
    }


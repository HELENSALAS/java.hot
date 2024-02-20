package clase5;

import java.util.Scanner;

public class ejercicio10Scanner{
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        
        System.out.println("Introduce el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto): ");
        int cargo = en.nextInt();
        
        System.out.println("Introduce los días que ha estado de viaje visitando clientes durante el mes: ");
        int diasViaje = en.nextInt();
        
        System.out.println("Introduce el estado civil del empleado (1 - Soltero, 2 - Casado): ");
        int estadoCivil = en.nextInt();
        
        double sueldoBase;
        
        // Calcular el sueldo base según el cargo
        switch (cargo) {
            case 1:
                sueldoBase = 950;
                break;
            case 2:
                sueldoBase = 1200;
                break;
            case 3:
                sueldoBase = 1600;
                break;
            default:
                System.out.println("Cargo no válido.");
                return;
        }
        
        double dietas = diasViaje * 30;
        double sueldoNeto = sueldoBase + dietas;
        
        double irpf;
        
        // Calcular el IRPF según el estado civil
        switch (estadoCivil) {
            case 1:
                irpf = sueldoNeto * 0.25;
                break;
            case 2:
                irpf = sueldoNeto * 0.20;
                break;
            default:
                System.out.println("Estado civil no válido.");
                return;
        }
        
        double sueldoTotal = sueldoNeto - irpf;
        
        // Mostrar la nómina desglosada
        System.out.println("Nómina del empleado:");
        System.out.println("Sueldo base: " + sueldoBase + " euros");
        System.out.println("Dietas: " + dietas + " euros");
        System.out.println("Sueldo neto: " + sueldoNeto + " euros");
        System.out.println("IRPF: " + irpf + " euros");
        System.out.println("Sueldo total: " + sueldoTotal + " euros");
    }
}
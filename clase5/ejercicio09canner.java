package clase5;

import java.util.Scanner;

public class ejercicio09canner {
    
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        
        System.out.println("Introduce el precio antes de impuestos: ");
        double baseImponible = en.nextDouble();
        
        System.out.println("Introduce el tipo de impuesto (general, reducido o superreducido): ");
        String tipoImpuesto = en.next();
        
        System.out.println("Introduce el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codigoPromocional = en.next();
        
        double impuesto;
        
        // Calcular el impuesto según el tipo
        switch (tipoImpuesto) {
            case "general":
                impuesto = baseImponible * 0.21;
                break;
            case "reducido":
                impuesto = baseImponible * 0.10;
                break;
            case "superreducido":
                impuesto = baseImponible * 0.04;
                break;
            default:
                System.out.println("Tipo de impuesto no válido.");
                return;
        }
        
        // Aplicar el descuento según el código promocional
        switch (codigoPromocional) {
            case "nopro":
                break;
            case "mitad":
                baseImponible = baseImponible / 2;
                break;
            case "meno5":
                baseImponible = baseImponible - 5;
                break;
            case "5porc":
                baseImponible = baseImponible - (baseImponible * 0.05);
                break;
            default:
                System.out.println("Código promocional no válido.");
                return;
        }
        
       
        double precioFinal = baseImponible + impuesto;
        
        System.out.println("El precio final del producto es: " + precioFinal);
    }
}


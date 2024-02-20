package clase5;

import java.util.Scanner;

public class ejercicio05Scanner {
    

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        
        System.out.println("Introduce el día de nacimiento:");
        int dia = en.nextInt();
        
        System.out.println("Introduce el mes de nacimiento:");
        int mes = en.nextInt();
        
        String signo = "";
        
        switch (mes) {
            case 1:
                if (dia > 21) {
                    signo = "ACUARIO";
                } else {
                    signo = "CAPRICORNIO";
                }
                break;
            case 2:
                if (dia > 19) {
                    signo = "PISCIS";
                } else {
                    signo = "ACUARIO";
                }
                break;
            case 3:
                if (dia > 20) {
                    signo = "ARIES";
                } else {
                    signo = "PISCIS";
                }
                break;
            case 4:
                if (dia > 20) {
                    signo = "TAURO";
                } else {
                    signo = "ARIES";
                }
                break;
            case 5:
                if (dia > 21) {
                    signo = "GÉMINIS";
                } else {
                    signo = "TAURO";
                }
                break;
            case 6:
                if (dia > 20) {
                    signo = "CÁNCER";
                } else {
                    signo = "GÉMINIS";
                }
                break;
            case 7:
                if (dia > 22) {
                    signo = "LEO";
                } else {
                    signo = "CÁNCER";
                }
                break;
            case 8:
                if (dia > 21) {
                    signo = "VIRGO";
                } else {
                    signo = "LEO";
                }
                break;
            case 9:
                if (dia > 22) {
                    signo = "LIBRA";
                } else {
                    signo = "VIRGO";
                }
                break;
            case 10:
                if (dia > 22) {
                    signo = "ESCORPIO";
                } else {
                    signo = "LIBRA";
                }
                break;
            case 11:
                if (dia > 21) {
                    signo = "SAGITARIO";
                } else {
                    signo = "ESCORPIO";
                }
                break;
            case 12:
                if (dia > 21) {
                    signo = "CAPRICORNIO";
                } else {
                    signo = "SAGITARIO";
                }
                break;
            default:
                System.out.println("Error: Mes inválido.");
                return;
        }
        
        System.out.println("Tu signo del zodiaco es: " + signo);
    }
}



package clase5;
import java.util.Scanner;

public class ejercicio01Scanner {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        boolean correcto = false;
        
        do {
            System.out.println("Introduce el día de la semana en número");
            int dia = en.nextInt();
            
            switch(dia) {
                case 1:
                    System.out.println("Es lunes");
                    correcto = true;
                    break;
                case 2:
                    System.out.println("Es martes");
                    correcto = true;
                    break;
                case 3:
                    System.out.println("Es miércoles");
                    correcto = true;
                    break;
                case 4:
                    System.out.println("Es jueves");
                    correcto = true;
                    break;
                case 5:
                    System.out.println("Es viernes");
                    correcto = true;
                    break;
                case 6:
                    System.out.println("Es sábado");
                    correcto = true;
                    break;
                case 7:
                    System.out.println("Es domingo");
                    correcto = true;
                    break;
                default:
                    System.out.println("El día " + dia + " no corresponde a ningún día de la semana");
            }
        } while(!correcto);
    }
}



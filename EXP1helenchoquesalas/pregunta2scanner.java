package EXP1helenchoquesalas;
import java.util.Scanner;

public class pregunta2scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int introducciones = 0;
        int numeroAnterior = 0;
        int numeroActual = 0;
        int maxRepeticiones = 0;
        int repeticionesActuales = 0;
        int numeroMasRepetido = 0;
        
        System.out.println("Ingrese números (ingrese 0 para finalizar):");
        
        do {
            numeroAnterior = numeroActual;
            numeroActual = scanner.nextInt();
            
            if (numeroActual != 0) {
                introducciones++;
                
                if (numeroActual == numeroAnterior) {
                    repeticionesActuales++;
                    
                    if (repeticionesActuales > maxRepeticiones) {
                        maxRepeticiones = repeticionesActuales;
                        numeroMasRepetido = numeroActual;
                    }
                } else {
                    repeticionesActuales = 1;
                }
            }
        } while (numeroActual != 0);
        
        System.out.println("El número más repetido es el " + numeroMasRepetido + " y se ha escrito " + maxRepeticiones + " veces.");
        System.out.println("Se realizaron " + introducciones + " introducciones en total.");
    }
}
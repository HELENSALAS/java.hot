package clase5;

 import java.util.Scanner;
 
public class ejercicio06Scanner {
   

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        
        int calificacion = 0;
        
        System.out.println("¡Bienvenido al minicuestionario!");
        System.out.println("Responde las siguientes preguntas:");
        
        // Pregunta 1
        System.out.println("1. ¿Cuál es la capital de España?");
        System.out.println("a) Madrid");
        System.out.println("b) Barcelona");
        System.out.println("c) Valencia");
        String respuesta1 = en.nextLine();
        if (respuesta1.equalsIgnoreCase("a")) {
            calificacion++;
        }
        
        // Pregunta 2
        System.out.println("2. ¿Cuál es el símbolo químico del oro?");
        System.out.println("a) Ag");
        System.out.println("b) Au");
        System.out.println("c) Fe");
        String respuesta2 = en.nextLine();
        if (respuesta2.equalsIgnoreCase("b")) {
            calificacion++;
        }
        
        // Pregunta 3
        System.out.println("cuanto es la mediana de 3,5,6,2,7");
        System.out.println("a) 3");
        System.out.println("b) 5");
        System.out.println("c) 6");
        String respuesta3 = en.nextLine();
        if (respuesta3.equalsIgnoreCase("b")) {
            calificacion++;
        }
        
        
        System.out.println("¡Cuestionario completado!");
        System.out.println("Tu calificación es: " + calificacion + "/3");
    }
}


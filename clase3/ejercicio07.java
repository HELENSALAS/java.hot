package clase3;

public class ejercicio07 {
    public static void main(String[] args) {
        String linea;
        //(dooble)lines
        System.out.println("las horas de trabajo:");
        linea =System.console().readLine();
        int primernumero = Integer.parseInt(linea);
        
        System.out.println("ingrese cuantas semanas de trabajo");
        linea = System.console().readLine();
        int segundonumero = Integer.parseInt(linea);
        
        int horas = primernumero * segundonumero;
        System.out.println("las horas de trabajo son:"+ horas);

      
    }
}

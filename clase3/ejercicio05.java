package clase3;

public class ejercicio05 {
    public static void main(String[] args) {
        String linea;
        //(dooble)lines
        System.out.println("ingrese la altura del rectangulo:");
        linea =System.console().readLine();
        int primernumero = Integer.parseInt(linea);
    
        System.out.println("ingrese la base del rectangulo");
        linea = System.console().readLine();
        int segundonumero = Integer.parseInt(linea);
    
        int multiplicacion = primernumero * segundonumero;
        System.out.println("el area del rectangulo es:"+ multiplicacion);
    }
}

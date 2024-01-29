package clase3;

public class ejercicio06 {
    public static void main(String[] args) {
        String linea;
        //(dooble)lines
        System.out.println("ingrese la altura del triangulo:");
        linea =System.console().readLine();
        int primernumero = Integer.parseInt(linea);
        
        System.out.println("ingrese la base del triangulo");
        linea = System.console().readLine();
        int segundonumero = Integer.parseInt(linea);
        
        int area = (primernumero * segundonumero) / 2;
        System.out.println("el area del triangulo es:"+ area);

    }
}

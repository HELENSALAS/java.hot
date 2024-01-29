public class leeNumeros {
    public static void main(String[] args) {
    String linea;
    //(dooble)lines
    System.out.println("ingrese un numero");
    linea =System.console().readLine();
    int primernumero = Integer.parseInt(linea);

    System.out.println("ingrese un otro numero");
    linea = System.console().readLine();
    int segundonumero = Integer.parseInt(linea);

    int suma = primernumero + segundonumero;
    System.out.println("la suma es:"+ suma);
    }
}

package Nuevo;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int numero = 335;
        if((numero > 1) && (numero < 100)) {
            System.out.println("El numero "+numero+" si esta entre 1 y 100");
        }else{
            System.out.println("El numero "+numero+" no esta entre 1 y 100");
        }
    }
}

package clase6parcial2;

    import java.util.Random;

public class ejercicio8 {
    public static void main(String[] args) {
        String[] figuras = { "corazón", "diamante", "herradura", "campana", "limón" };
        Random random = new Random();

        // Simulación de la tirada de la máquina tragaperras
        String figura1 = figuras[random.nextInt(5)];
        String figura2 = figuras[random.nextInt(5)];
        String figura3 = figuras[random.nextInt(5)];

        System.out.println("Tirada: " + figura1 + " - " + figura2 + " - " + figura3);

        // Evaluación de los resultados de la tirada
        if (figura1.equals(figura2) && figura2.equals(figura3)) {
            System.out.println("Enhorabuena, ha ganado 10 monedas");
        } else if (figura1.equals(figura2) || figura1.equals(figura3) || figura2.equals(figura3)) {
            System.out.println("Bien, ha recuperado su moneda");
        } else {
            System.out.println("Lo siento, ha perdido");
        }
    }
}


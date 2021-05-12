import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        int primerDado;
        int segundoDado;

        Random numeroAleatorio = new Random();
        System.out.println("¡AQUI VAN LAS TIRADAS!");

        do {
            primerDado = numeroAleatorio.nextInt(6) + 1;
            System.out.println("Primer dado: " + primerDado);

            segundoDado = numeroAleatorio.nextInt(6) + 1;
            System.out.println("Segundo dado: " + segundoDado + "\n");

        } while (primerDado != segundoDado);


    }
}

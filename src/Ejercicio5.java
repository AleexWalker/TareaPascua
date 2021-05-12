import java.io.*;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ejercicio5 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuál es el archivo? ");
        String entrada = teclado.next();

        try {
            FileReader fichero = new FileReader("/home/administrador/Escritorio/Lector/" + entrada);
            BufferedReader lector = new BufferedReader(fichero);

            int caracter = 0;
            do {
                fichero.skip(2);
                System.out.print((char) caracter);
                caracter = fichero.read();
            } while (caracter != -1);
        } catch (Exception e) {
            System.out.println("Fichero no leído");
        }
    }
}

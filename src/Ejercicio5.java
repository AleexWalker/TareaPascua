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

            String linea;
            while ((linea = lector.readLine()) != null) {
                lector.skip(2);
                System.out.println(linea);
            }
        } catch (Exception e) {
            System.out.println("Fichero no leído");
        }
    }
}

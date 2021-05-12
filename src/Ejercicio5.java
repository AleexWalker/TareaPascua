import java.io.*;
import java.util.Scanner;
import java.util.stream.Stream;

/** Clase main del Ejercicio5
 * Este programa lo que hace es abrir un fichero ya existente,
 * el nombre del cual nos introduce el usuario, y a continuación
 * imprime el contenido de este (que se trata de un mensaje secreto)
 */
public class Ejercicio5 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);   /** Importamos la clase Scanner */

        System.out.print("¿Cuál es el archivo? ");  /** Entrada de información por parte del usuario */
        String entrada = teclado.next();

        try {
            FileReader fichero = new FileReader("/home/administrador/Escritorio/Lector/" + entrada);   /** Seleccionamos el fichero deseado con la clase File */
            BufferedReader lector = new BufferedReader(fichero);                                                /** BufferedReader es una clase de Java para leer el texto de una secuencia de entrada (como un archivo) almacenando en el búfer caracteres que leen */

            /**
             * En el siguiente bucle lo que se hace es inicializar la variable caracter primeramente
             * El método java.io.Reader.skip (n) omite caracteres. Este método se bloqueará hasta que haya algunos caracteres disponibles, se produzca un error de E / S o se alcance el final de la secuencia.
             * Finalmente imprimimos, leemos y contemplamos las excepciones.
             */

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
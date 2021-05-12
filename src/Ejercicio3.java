import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Número: ");
        int entrada = teclado.nextInt();
        int sumatorio = 0;

        for (int i = 1 ; i <= entrada ; i++){
            System.out.println(i + " ");
            sumatorio = sumatorio + i;
        }
        System.out.println("La suma es: " + sumatorio);
    }
}

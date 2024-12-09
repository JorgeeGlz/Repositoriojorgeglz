import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static void imprimirPositivos(int[] numeros) {
            System.out.println("Números positivos:");
            for (int numero : numeros) {
                if (numero > 0) {
                    System.out.println(numero);
                }
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("¿Cuántos números quieres ingresar?");
            int n = scanner.nextInt();

            int[] numeros = new int[n];
            System.out.println("Ingresa " + n + " números:");
            for (int i = 0; i < n; i++) {
                numeros[i] = scanner.nextInt();
            }

            imprimirPositivos(numeros);
            scanner.close();
        }
    }


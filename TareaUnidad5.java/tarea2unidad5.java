import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

            public static double calcularMedia(int[] numeros) {
                int suma = 0;
                for (int numero : numeros) {
                    suma += numero;
                }
                return numeros.length > 0 ? (double) suma / numeros.length : 0;
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

                System.out.println("La media es: " + calcularMedia(numeros));
                scanner.close();
            }
        }

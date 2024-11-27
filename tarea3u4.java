import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("¿Cuántos números quieres ingresar? ");
                int n = scanner.nextInt();
                int[] numeros = new int[n];


                System.out.println("Ingresa " + n + " números enteros:");
                for (int i = 0; i < n; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    numeros[i] = scanner.nextInt();
                }


                boolean[] contado = new boolean[n];

                System.out.println("\nFrecuencia de elementos:");


                for (int i = 0; i < n; i++) {
                    if (!contado[i]) {
                        int frecuencia = 1;
                        for (int j = i + 1; j < n; j++) {
                            if (numeros[i] == numeros[j]) {
                                frecuencia++;
                                contado[j] = true;
                            }
                        }

                        System.out.println("Número " + numeros[i] + ": " + frecuencia + " veces");
                    }
                }
            }
        }

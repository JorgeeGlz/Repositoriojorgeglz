import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                int[] numeros = new int[15];


                System.out.println("Ingresa 15 números enteros:");
                for (int i = 0; i < numeros.length; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    numeros[i] = scanner.nextInt();
                }


                int mayor = numeros[0];
                int menor = numeros[0];
                int posicionMayor = 0;
                int posicionMenor = 0;

                for (int i = 1; i < numeros.length; i++) {
                    if (numeros[i] > mayor) {
                        mayor = numeros[i];
                        posicionMayor = i;
                    }
                    if (numeros[i] < menor) {
                        menor = numeros[i];
                        posicionMenor = i;
                    }
                }


                System.out.println("\nResultados:");
                System.out.println("Número mayor: " + mayor + " en la posición " + (posicionMayor + 1));
                System.out.println("Número menor: " + menor + " en la posición " + (posicionMenor + 1));
            }
        }

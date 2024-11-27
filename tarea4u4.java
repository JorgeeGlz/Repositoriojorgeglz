import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                int[] numeros = new int[10];

                System.out.println("Ingresa 10 números enteros:");
                for (int i = 0; i < numeros.length; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    numeros[i] = scanner.nextInt();
                }


                System.out.println("\nArreglo en orden inverso:");
                for (int i = numeros.length - 1; i >= 0; i--) {
                    System.out.print(numeros[i] + " ");
                }
            }
        }

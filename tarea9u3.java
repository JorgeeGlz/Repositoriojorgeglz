import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                
                System.out.print("Ingresa el tamaño de la matriz cuadrada (n): ");
                int n = scanner.nextInt();


                int[][] matriz = new int[n][n];


                System.out.println("Ingresa los elementos de la matriz:");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print("Elemento [" + i + "][" + j + "]: ");
                        matriz[i][j] = scanner.nextInt();
                    }
                }


                int sumaDiagonalPrincipal = 0;
                int sumaDiagonalSecundaria = 0;


                for (int i = 0; i < n; i++) {
                    sumaDiagonalPrincipal += matriz[i][i];
                    sumaDiagonalSecundaria += matriz[i][n - 1 - i];
                }


                System.out.println("\nSuma de los elementos de la diagonal principal: " + sumaDiagonalPrincipal);
                System.out.println("Suma de los elementos de la diagonal secundaria: " + sumaDiagonalSecundaria);
            }
        }


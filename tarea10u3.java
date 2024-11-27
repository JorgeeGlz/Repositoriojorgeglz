import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);


                System.out.print("Ingresa el número de filas (n): ");
                int filas = scanner.nextInt();
                System.out.print("Ingresa el número de columnas (m): ");
                int columnas = scanner.nextInt();


                int[][] matriz = new int[filas][columnas];


                System.out.println("Ingresa los elementos de la matriz:");
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print("Elemento [" + i + "][" + j + "]: ");
                        matriz[i][j] = scanner.nextInt();
                    }
                }


                int[][] transpuesta = new int[columnas][filas];


                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        transpuesta[j][i] = matriz[i][j];
                    }
                }


                System.out.println("\nMatriz original:");
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println();
                }


                System.out.println("\nMatriz transpuesta:");
                for (int i = 0; i < columnas; i++) {
                    for (int j = 0; j < filas; j++) {
                        System.out.print(transpuesta[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }


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


                System.out.println("\nMatriz original:");
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println();
                }


                System.out.print("\nIngresa el índice de la primera fila a intercambiar (0 a " + (filas - 1) + "): ");
                int fila1 = scanner.nextInt();
                System.out.print("Ingresa el índice de la segunda fila a intercambiar (0 a " + (filas - 1) + "): ");
                int fila2 = scanner.nextInt();


                if (fila1 >= 0 && fila1 < filas && fila2 >= 0 && fila2 < filas && fila1 != fila2) {
                    // Intercambiar las filas
                    for (int j = 0; j < columnas; j++) {
                        int temp = matriz[fila1][j];
                        matriz[fila1][j] = matriz[fila2][j];
                        matriz[fila2][j] = temp;
                    }

                    
                    System.out.println("\nMatriz después de intercambiar las filas:");
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            System.out.print(matriz[i][j] + " ");
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Índices de filas inválidos. Asegúrate de ingresar filas distintas dentro del rango permitido.");
                }
            }
        }


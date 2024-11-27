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


                System.out.println("\nSuma de cada fila:");
                for (int i = 0; i < filas; i++) {
                    int sumaFila = 0;
                    for (int j = 0; j < columnas; j++) {
                        sumaFila += matriz[i][j];
                    }
                    System.out.println("Fila " + (i + 1) + ": " + sumaFila);
                }


                System.out.println("\nSuma de cada columna:");
                for (int j = 0; j < columnas; j++) {
                    int sumaColumna = 0;
                    for (int i = 0; i < filas; i++) {
                        sumaColumna += matriz[i][j];
                    }
                    System.out.println("Columna " + (j + 1) + ": " + sumaColumna);
                }
            }
        }

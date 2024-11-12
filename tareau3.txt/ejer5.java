import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();

        System.out.print("Divisores de " + n + ": ");
        boolean tieneDivisores = false;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                tieneDivisores = true;
            }
        }

        if (!tieneDivisores) {
            System.out.println("El número no tiene divisores aparte de 1 y él mismo.");
        }

        scanner.close();
    }
    }

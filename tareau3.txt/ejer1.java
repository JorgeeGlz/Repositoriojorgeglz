import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int cantidad = scanner.nextInt();

        double suma = 0;
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese un número: ");
            double numero = scanner.nextDouble();
            suma += numero;
        }

        double promedio = suma / cantidad;

        if (promedio > 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

        scanner.close();
    }
    }

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número para la tabla de multiplicar: ");
        int numero = scanner.nextInt();

        System.out.print("Ingrese el rango hasta el cual multiplicar: ");
        int rango = scanner.nextInt();

        for (int i = 1; i <= rango; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}

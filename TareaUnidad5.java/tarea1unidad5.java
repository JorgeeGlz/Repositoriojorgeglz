import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double celsiusAFahrenheit(double celsius) {
                return celsius * 9 / 5 + 32;
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Ingresa un valor en grados Celsius (puedes ingresar varios valores separados por Enter, y escribe 'fin' para terminar):");
                while (scanner.hasNextDouble()) {
                    double celsius = scanner.nextDouble();
                    System.out.println(celsius + "°C = " + celsiusAFahrenheit(celsius) + "°F");
                }
                scanner.close();
            }
        }

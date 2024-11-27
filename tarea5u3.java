import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);


                System.out.print("Ingresa una cadena de texto: ");
                String cadena = scanner.nextLine();


                cadena = cadena.replaceAll("\\s+", "").toLowerCase();


                boolean esPalindromo = true;
                int longitud = cadena.length();

                for (int i = 0; i < longitud / 2; i++) {
                    if (cadena.charAt(i) != cadena.charAt(longitud - 1 - i)) {
                        esPalindromo = false;
                        break;
                    }
                }


                if (esPalindromo) {
                    System.out.println("La cadena es un palíndromo.");
                } else {
                    System.out.println("La cadena no es un palíndromo.");
                }
            }
        }


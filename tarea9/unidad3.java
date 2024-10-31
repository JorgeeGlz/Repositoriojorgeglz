//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                String palabra = "book";
                String vocales = "aeiouAEIOU";

                int longitudCadena = 4;

                int contadorUno = 0;
                int contadorDos = 0;
                int cont = 0;


                while (cont < longitudCadena / 2) {

                    if (vocales.indexOf(palabra.charAt(cont)) != -1) {
                        contadorUno++;
                    }

                    if (vocales.indexOf(palabra.charAt(cont + longitudCadena / 2)) != -1) {
                        contadorDos++;
                    }
                    cont++;
                }

                // Resultado: true si ambas mitades tienen el mismo número de vocales, false en caso contrario
                boolean result = (contadorUno == contadorDos);
                System.out.println(result); //
            }
        }

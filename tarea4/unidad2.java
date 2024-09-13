//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
            double arriba = (12+8)*(5-3)-(6/2);
            double abajo = (3*4)+(8/2);
            System.out.println("El resultado es:" + arriba/abajo);

        //Ejercicio 2
        double numerador = (((9 * 5) - (15 + 3) + (8 * 2) - (12.0 / 4)) * (7 + 2) - (6 * 3 / 2.0)) / (2 + (3 * 2.0) / (4 - 2)) + 5 * ((8 / 4.0) + 1) - (6 / (2 + 1));
        double denominador = (((4 + 2) * (7 - 1)) / (3 + 1) + ((3 * 2) - (5 + 1)) * (8 / 2.0)) / (3 + (6 / 2.0) + (7 / 2.0)) + 2 * (3 + (8 / 4.0));
        double resultado = numerador / denominador;
        System.out.println("El resultado es: " + resultado);

        //Ejercicio 3
        double arribaUno = ((6+4)*3)-(18/2);
        double abajoUno = (8-5)+(3*2);
        double total = arribaUno / abajoUno;
        System.out.println("El resultado es: " + total);

        }
    }

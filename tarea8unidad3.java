//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// 1. Imprimir números del 1 al 10
        int contador = 1;
        while (contador <= 10) {
            System.out.print(contador + " ");
            contador++;
        }
        System.out.println(); // Salto de línea

        // 2. Suma de los primeros 10 números naturales
        int suma = 0;
        contador = 1;
        while (contador <= 10) {
            suma += contador;
            contador++;
        }
        System.out.println("Suma de los primeros 10 números: " + suma);

        // 3. Contar dígitos de un número
        int numero = 12345;
        int digitos = 0;
        int numTemp = numero;
        while (numTemp != 0) {
            numTemp /= 10;
            digitos++;
        }
        System.out.println("Cantidad de dígitos en " + numero + ": " + digitos);

        // 4. Imprimir números pares entre 1 y 20
        contador = 1;
        while (contador <= 20) {
            if (contador % 2 == 0) {
                System.out.print(contador + " ");
            }
            contador++;
        }
        System.out.println();

        // 5. Sumar dígitos de un número
        suma = 0;
        numTemp = numero;
        while (numTemp != 0) {
            suma += numTemp % 10;
            numTemp /= 10;
        }
        System.out.println("Suma de los dígitos en " + numero + ": " + suma);

        // 6. Múltiplos de un número hasta cierto límite
        int n = 3;
        int limite = 20;
        contador = 1;
        while (n * contador <= limite) {
            System.out.print(n * contador + " ");
            contador++;
        }
        System.out.println();

        // 7. Suma de dígitos pares de un número
        suma = 0;
        numTemp = numero;
        while (numTemp != 0) {
            int digito = numTemp % 10;
            if (digito % 2 == 0) {
                suma += digito;
            }
            numTemp /= 10;
        }
        System.out.println("Suma de los dígitos pares en " + numero + ": " + suma);

        // 8. Imprimir números en orden inverso
        int numInverso = 10;
        while (numInverso > 0) {
            System.out.print(numInverso + " ");
            numInverso--;
        }
        System.out.println();

        // 9. Sumar solo números impares de un número dado
        suma = 0;
        numTemp = numero;
        while (numTemp != 0) {
            int digito = numTemp % 10;
            if (digito % 2 != 0) {
                suma += digito;
            }
            numTemp /= 10;
        }
        System.out.println("Suma de los dígitos impares en " + numero + ": " + suma);

        // 10. Contar vocales de una cadena
        String cadena = "cadena de ejemplo";
        int contadorVocales = 0;
        int i = 0;
        while (i < cadena.length()) {
            char c = Character.toLowerCase(cadena.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }
            i++;
        }
        System.out.println("Cantidad de vocales en '" + cadena + "': " + contadorVocales);

        // 11. Determinar si un número es perfecto
        numero = 6;
        suma = 0;
        contador = 1;
        while (contador <= numero / 2) {
            if (numero % contador == 0) {
                suma += contador;
            }
            contador++;
        }
        boolean esPerfecto = suma == numero;
        System.out.println("¿Es " + numero + " un número perfecto? " + esPerfecto);
    }
}

        

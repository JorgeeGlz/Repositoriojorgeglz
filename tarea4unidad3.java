import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int numero = input.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("El número es divisible entre 3 y 5.");
        } else if (numero % 3 == 0) {
            System.out.println("El número es divisible entre 3.");
        } else if (numero % 5 == 0) {
            System.out.println("El número es divisible entre 5.");
        } else {
            System.out.println("El número no es divisible ni entre 3 ni entre 5.");
        }

        System.out.println("\nIntroduce los tres lados del triángulo:");
        int ladoUno = input.nextInt();
        int ladoDos = input.nextInt();
        int ladoTres = input.nextInt();

        if (ladoUno == ladoDos && ladoDos == ladoTres) {
            System.out.println("Es un triángulo equilátero.");
        } else if (ladoUno == ladoDos || ladoDos == ladoTres || ladoUno == ladoTres) {
            System.out.println("Es un triángulo isósceles.");
        } else {
            System.out.println("Es un triángulo escaleno.");
        }

        System.out.println("\nIntroduce el salario:");
        double salario = input.nextDouble();

        if (salario <= 10000) {
            System.out.println("No paga impuestos.");
        } else if (salario <= 20000) {
            double impuesto = salario * 0.10;
            System.out.println("Paga un impuesto del 10%. Impuesto a pagar: " + impuesto);
        } else {
            double impuesto = salario * 0.20;
            System.out.println("Paga un impuesto del 20%. Impuesto a pagar: " + impuesto);
        }

        System.out.println("\nIntroduce otro número:");
        numero = input.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("El número es divisible entre 3 y 5.");
        } else if (numero % 3 == 0) {
            System.out.println("El número es divisible entre 3.");
        } else if (numero % 5 == 0) {
            System.out.println("El número es divisible entre 5.");
        } else {
            System.out.println("El número no es divisible ni entre 3 ni entre 5.");
        }

        System.out.println("\nIntroduce un número para verificar si es par o impar:");
        numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
        }
    }

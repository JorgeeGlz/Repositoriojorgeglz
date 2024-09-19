import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa la coordenada x del rpimer punto");
        double x = input.nextDouble();
        System.out.println("Ingresa la coordenada y del primer punto");
        double y = input.nextDouble();
        System.out.println("Ingresa la coordenada x del segundo punto");
        double xDos = input.nextDouble();
        System.out.println("Ingresa la coordenada y del segundo punto");
        double yDos = input.nextDouble();

        System.out.println("Distancia entre dos puntos:");
        double resta = xDos - x;
        double restaDos = yDos - y;
        double potenciaUno = Math.pow(resta, 2);
        double potenciaDos = Math.pow(restaDos, 2);
        double sumaPotencia = potenciaUno + potenciaDos;
        double distancia = Math.sqrt(sumaPotencia);
        System.out.println("AB:" + distancia);

        System.out.println("Angulo");
        double angulo = Math.atan2(yDos- y, xDos - x);
        System.out.println(angulo);

        System.out.println("Conversion a grados:");
        double grados = angulo*180/Math.PI;
        System.out.println(grados);
        }
    }

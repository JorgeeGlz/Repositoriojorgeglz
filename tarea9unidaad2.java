import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa la coordenada de x de la primera coordenada:");
        int xUno = input.nextInt();
        System.out.print("Ingresa la coordenada de y de la primera coordenada:");
        int yUno= input.nextInt();
        System.out.print("Ingresa la coordenada de x de la segunda coordenada:");
        int xDos = input.nextInt();
        System.out.print("Ingresa la coordenada de y de la segunda coordenada: ");
        int yDos = input.nextInt();
        System.out.print("Ingresa la coordenada de x de la tercera coordenada: ");
        int xTres = input.nextInt();
        System.out.println("Ingresa la coordenada de y de la tercera coordenada: ");
        int yTres = input.nextInt();

        double restaUno =xDos-xUno;
        double restaDos = yDos-yUno;
        double potenciaUno = Math.pow(restaUno, 2);
        double potenciaDos = Math.pow(restaDos, 2);
        double sumaPotencia = potenciaUno + potenciaDos;
        double distanciaAB = Math.sqrt(sumaPotencia);
        System.out.println("Lado AB: " + distanciaAB);

        double restaUnoBc =xDos-xTres;
        double restaDosBc = yDos-yTres;
        double potenciaUnoBc = Math.pow(restaUnoBc, 2);
        double potenciaDosBc = Math.pow(restaDosBc, 2);
        double sumaPotenciaBc = potenciaUnoBc + potenciaDosBc;
        double distanciaBc = Math.sqrt(sumaPotenciaBc);
        System.out.println("Lado BC: " + distanciaBc);

        double restaUnoCa =xUno - xTres;
        double restaDosCa = yUno- xUno;
        double potenciaUnoCa = Math.pow(restaUnoCa, 2);
        double potenciaDosCa = Math.pow(restaDosCa, 2);
        double sumaPotenciaCa = potenciaUnoCa + potenciaDosCa;
        double distanciaCa = Math.sqrt(sumaPotenciaCa);
        System.out.println("Lado CA: " + distanciaCa);

        double perimetro = distanciaCa+distanciaBc+distanciaAB;
        System.out.println("Perimetro: " + perimetro);

        double semiperimetro = (distanciaCa+distanciaBc+distanciaAB)/2;
        double area = semiperimetro*(semiperimetro-distanciaAB)*(semiperimetro-distanciaBc)*(semiperimetro-distanciaCa);
        double areaTotal = Math.sqrt(area);
        System.out.println("Area del trángulo: " + areaTotal);

        double altura= (2*areaTotal)/distanciaAB;
        System.out.println("Altura: " + altura);

        double anguloA = Math.toDegrees(Math.acos((Math.pow(distanciaBc, 2) + Math.pow(distanciaCa, 2) - Math.pow(distanciaAB, 2)) / (2 * distanciaBc * distanciaCa)));
        double anguloB = Math.toDegrees(Math.acos((Math.pow(distanciaAB, 2) + Math.pow(distanciaCa, 2) - Math.pow(distanciaBc, 2)) / (2 * distanciaAB * distanciaCa)));
        double anguloC = Math.toDegrees(Math.acos((Math.pow(distanciaAB, 2) + Math.pow(distanciaBc, 2) - Math.pow(distanciaCa, 2)) / (2 * distanciaAB * distanciaBc)));
        System.out.println("Angulo A: " + anguloA);
        System.out.println("Angulo B: " + anguloB);
        System.out.println("Angulo C: " + anguloC);

        boolean equilatero = false;
        System.out.println("El trámgulo es equilatero: " + equilatero);

        double puntoMedioAB= ((xUno+xDos)/2);
        double puntoMedioABY = ((yUno+yDos)/2);
        System.out.println("Punto medio AB: " + puntoMedioAB);
        System.out.println("Punto medio AB: " + puntoMedioABY);

        double puntoMedioBc= ((xDos+xTres)/2);
        double puntoMedioBcy = ((yDos+yTres)/2);
        System.out.println("Punto medio BC: " + puntoMedioBc);
        System.out.println("Punto medio BC: " + puntoMedioBcy);

        double puntoMedioCa= ((xTres+xUno)/2);
        double puntoMedioCay = ((yTres+yUno)/2);
        System.out.println("Punto medio CA: " + puntoMedioCa);
        System.out.println("Punto medio CA: " + puntoMedioCay);


        }
    }

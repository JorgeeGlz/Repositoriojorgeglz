import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                double[] calificaciones = new double[10];
                double suma = 0;


                System.out.println("Ingresa las calificaciones de 10 estudiantes:");
                for (int i = 0; i < calificaciones.length; i++) {
                    System.out.print("Calificación del estudiante " + (i + 1) + ": ");
                    calificaciones[i] = scanner.nextDouble();
                    suma += calificaciones[i];
                }


                double promedio = suma / calificaciones.length;


                int porEncima = 0;
                int porDebajo = 0;

                for (double calificacion : calificaciones) {
                    if (calificacion > promedio) {
                        porEncima++;
                    } else if (calificacion < promedio) {
                        porDebajo++;
                    }
                }

                System.out.println("\nResultados:");
                System.out.println("Promedio de las calificaciones: " + promedio);
                System.out.println("Estudiantes con calificaciones por encima del promedio: " + porEncima);
                System.out.println("Estudiantes con calificaciones por debajo del promedio: " + porDebajo);
            }
        }

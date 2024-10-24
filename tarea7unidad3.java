import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        String nombre = input.nextLine();
        System.out.println("Ingresa tu puntaje crediticio (300,850:");
        int crediticio = input.nextInt();
        System.out.println("Ingresa tus ingresos mensuales:");
        double ingresos = input.nextDouble();
        System.out.println("Cantidad solicitada para el crédito hipótecario:");
        double cantidadSolicitada = input.nextDouble();
        System.out.println("Ingrese la duracion del préstamo en años:");
        int duracionPrestamo = input.nextInt();
        System.out.println("Ingresa el porcentaje de ahorro personal:");
        double porcentajeAhorro = input.nextDouble();

        if (!nombre.matches(".\\d.")) {
            System.out.println("El nombre no debe contener números.");
            return;
        }

        if (crediticio < 300 || crediticio > 850) {
            System.out.println("Puntaje crediticio inválido.");
            return;
        }

        double tasaInteres;
        if (crediticio < 600) {
            System.out.println("Solicitud rechazada por bajo puntaje crediticio.");
            return;
        } else if (crediticio >= 600 && crediticio <= 740) {
            tasaInteres = 0.06;
            if (ingresos < 3 * (calcularCuotaMensual(cantidadSolicitada, tasaInteres, duracionPrestamo))) {
                System.out.println("Solicitud rechazada: los ingresos mensuales no son suficientes.");
                return;
            }
        } else {
            tasaInteres = 0.04;
            if (ingresos / calcularCuotaMensual(cantidadSolicitada, tasaInteres, duracionPrestamo) < 2.5) {
                System.out.println("Solicitud rechazada: la relación ingreso-cuota es demasiado baja.");
                return;
            }
        }
        double cuotaMensual = calcularCuotaMensual(cantidadSolicitada, tasaInteres, duracionPrestamo);

        double montoTotal = cuotaMensual * duracionPrestamo * 12;

        System.out.println("Nombre: " + nombre);
        System.out.println("Estado de la solicitud: Aprobada");
        System.out.println("Tasa de interés: " + (tasaInteres * 100) + "%");
        System.out.println("Cuota mensual: $" + cuotaMensual);
        System.out.println("Monto total a pagar: $" + montoTotal);
    }

    public static double calcularCuotaMensual(double cantidadSolicitada, double tasaInteres, int duracionPrestamo) {
        double r = tasaInteres / 12;
        int n = duracionPrestamo * 12;
        return (cantidadSolicitada * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
    }
}


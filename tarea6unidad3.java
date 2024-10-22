import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

                System.out.println("Ingrese su tipo de membresía (Premium, Estándar o Básica):");
                String membresia = input.nextLine().toLowerCase();

                System.out.println("Ingrese su edad:");
                int edad = input.nextInt();

                System.out.println("¿Es el evento nacional o internacional? (nacional/internacional):");
                input.nextLine();
                String tipoEvento = input.nextLine().toLowerCase();


                if (membresia.equals("premium")) {
                    if (edad < 18) {
                        System.out.println("No puede comprar boletos para eventos internacionales.");
                    } else if (edad >= 18 && edad < 25) {
                        System.out.println("Descuento del 10% para eventos nacionales.");
                        if (tipoEvento.equals("internacional")) {
                            System.out.println("Descuento del 15% para eventos internacionales.");
                        }
                    } else if (edad >= 25) {
                        System.out.println("Descuento del 20% para eventos nacionales.");
                        if (tipoEvento.equals("internacional")) {
                            System.out.println("Descuento del 25% para eventos internacionales.");
                        }
                    }
                } else if (membresia.equals("estándar") || membresia.equals("básica")) {
                    if (edad < 18) {
                        System.out.println("No puede comprar boletos para eventos internacionales.");
                    } else {
                        System.out.println("Descuento del 5% para eventos nacionales.");
                        if (tipoEvento.equals("internacional")) {
                            System.out.println("Descuento del 10% para eventos internacionales.");
                        }
                    }
                }
        System.out.println("Ingrese su nombre completo (menos de 25 caracteres):");
        String nombre = input.nextLine();

        System.out.println("Ingrese su ID (8 dígitos):");
        String id = input.nextLine();

        System.out.println("Ingrese su promedio general:");
        double promedio = input.nextDouble();

        System.out.println("Ingrese la cantidad de materias que desea inscribir:");
        int materias = input.nextInt();

        System.out.println("¿Aprobó más de 3 materias el semestre anterior? (true/false):");
        boolean aproboMasDe3Materias = input.nextBoolean();


        if (promedio < 7.0) {
            System.out.println("Inscripción denegada: Su promedio es menor a 7.0. No puede inscribir materias.");
        } else if (promedio >= 7.0 && promedio < 8.5) {

            if (materias < 3) {
                System.out.println("Inscripción permitida.");
            } else {
                System.out.println("Inscripción denegada: No puede inscribir 3 o más materias por sobrecarga académica.");
            }
        } else if (promedio >= 8.5) {

            if (nombre.length() > 25) {
                System.out.println("El nombre es demasiado largo. Debe contener menos de 25 caracteres.");
            } else if (id.length() != 8) {
                System.out.println("ID inválido: El ID debe contener exactamente 8 dígitos.");
            } else {
                if (materias <= 5) {
                    System.out.println("Inscripción permitida.");
                } else if (materias > 5 && aproboMasDe3Materias) {
                    System.out.println("Inscripción permitida: Puede inscribir hasta 6 materias.");
                } else {
                    System.out.println("Inscripción denegada: No puede inscribir más de 5 materias.");
                }
            }
        }

        // Solicitar información del usuario
        System.out.println("Ingrese su nombre:");
        String nombre1 = input.nextLine();
        input.nextLine();

        // Validación de que el nombre no contenga números
        if (nombre1.matches(".*\\d.*")) {
            System.out.println("Error: El nombre no debe contener números.");
            return;
        }

        System.out.println("Ingrese su edad:");
        int edad1 = input.nextInt();
        input.nextLine();

        // Validación de edad
        if (edad1 < 25) {
            System.out.println("No es elegible para beneficios, ya que la edad es menor a 25.");
            return;
        }

        System.out.println("Ingrese su país de residencia:");
        String pais = input.nextLine().toLowerCase();

        System.out.println("Ingrese su estado civil (soltero/casado):");
        String estadoCivil = input.nextLine().toLowerCase();

        System.out.println("Ingrese sus ingresos anuales:");
        double ingresos = input.nextDouble();

        System.out.println("¿Tiene hijos? (true/false):");
        boolean tieneHijos = input.nextBoolean();


        double descuento = 0;


        if (pais.equals("méxico")) {
            if (estadoCivil.equals("casado")) {
                if (ingresos < 300000) {
                    descuento = tieneHijos ? 10 : 5;
                }
            } else if (estadoCivil.equals("soltero")) {
                if (ingresos < 400000) {
                    descuento = 8;
                }
            }
        } else if (pais.equals("usa")) {
            if (ingresos < 500000) {
                descuento = estadoCivil.equals("casado") ? 12 : 7;
            }
            if (tieneHijos) {
                descuento += 3;
            }
        } else if (pais.equals("canadá") || pais.equals("otro")) {
            descuento = estadoCivil.equals("casado") ? 5 : 3;
            if (ingresos < 200000) {
                descuento += 2;
            }
        }


        System.out.println("Nombre del usuario: " + nombre1);
        System.out.println("Descuento aplicado: " + descuento + "%");


        double montoSeguro = 10000;
        double montoFinal = montoSeguro - (montoSeguro * (descuento / 100));

        System.out.println("Monto final a pagar por el seguro: $" + montoFinal);
    }
}












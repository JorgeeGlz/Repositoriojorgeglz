//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String correo = "juan.perez@empresa.com";
        String fechaAscenso = "2023-04-15";
        double salario = 50000.75;

        String nombreUsuario = "juan.perez";
        String nombreUsuarioInvertido = new StringBuilder(nombreUsuario).reverse().toString();
        String correoCifrado = nombreUsuarioInvertido + "@" + "empresa.com";

        int fecha = 2023+04+15;

        int parteEntera = (int) salario;
        double parteDecimal = salario - parteEntera;
        double diferencia = parteEntera - parteDecimal;
        double salarioCifrado = diferencia * 2;

        // Salida del cifrado
        System.out.println(correoCifrado + "|" + fecha+ "|" + salarioCifrado);
        }
    }

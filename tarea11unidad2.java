public class Main {
    public static void main(String[] args) {
        String nombreCompleto = "García, Juan Carlos";

        int longitudNombreCompleto = nombreCompleto.length();
        System.out.println("Longitud del nombre completo: " + longitudNombreCompleto);

        String apellido = nombreCompleto.substring(0, nombreCompleto.indexOf(","));
        System.out.println("Apellido: " + apellido);

        String nombreSinApellido = nombreCompleto.substring(nombreCompleto.indexOf(",") + 2);
        System.out.println("Nombre sin apellido: " + nombreSinApellido);

        String primerNombre = nombreSinApellido.split(" ")[0];
        System.out.println("Primer nombre: " + primerNombre);

        String apellidoMayusculas = apellido.toUpperCase();
        System.out.println("Apellido en mayúsculas: " + apellidoMayusculas);

        String nombreCompletoMinusculas = nombreCompleto.toLowerCase();
        System.out.println("Nombre completo en minúsculas: " + nombreCompletoMinusculas);

        char caracterPosicion5 = nombreCompleto.charAt(4);
        System.out.println("Carácter en la posición 5: " + caracterPosicion5);

        int primeraOcurrenciaA = nombreCompleto.indexOf('a') + 1;
        System.out.println("Primera ocurrencia de 'a': " + primeraOcurrenciaA);

        int ultimaOcurrenciaA = nombreCompleto.lastIndexOf('a') + 1;
        System.out.println("Última ocurrencia de 'a': " + ultimaOcurrenciaA);
        }
    }

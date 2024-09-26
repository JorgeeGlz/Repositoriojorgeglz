//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    String palabra =" Av. Libertador, 1234, Ciudad de México, C.P. 06000";
    int longitud = palabra.length();
    System.out.println("Longitud: " + longitud);

    char posUno = palabra.charAt(1);
    System.out.println("El primer caracter de la dirreccion es:"+posUno);

    char posDos = palabra.charAt(50);
    System.out.println("El ultimo caracter de la dirreccion es:"+posDos);

    String mayusculas =palabra.toUpperCase();
    System.out.println("En mayuscula es:"+mayusculas);

    String minusculas = palabra.toLowerCase();
    System.out.println("En minuscula es:"+minusculas);

    String calle = palabra.substring(1,15);
    System.out.println("En calle es:"+calle);

    String numero = palabra.substring(17,21);
    System.out.println("En numero es:"+numero);

    String ciudad = palabra.substring(23,39);
    System.out.println("En ciudad es:"+ciudad);

    String cP = palabra.substring(46,51);
    System.out.println("El código postal es:"+cP);

    int ocurrencia = palabra.indexOf("1");
    System.out.println("El aparicion es:"+ocurrencia);

        int totalA = palabra.length() - palabra.replace(palabra, " Av Liberador 1234 Ciudad de Mexico CP 060000").length();
        System.out.println("Dirección corregida: " + palabra);

        String direccionSinEspacios = palabra.trim();
        System.out.println("Dirección sin espacios extras:" +direccionSinEspacios);

        String abreviacion = "Liberador, 1234, México, 060000";
        System.out.println("Version abreviada de la dirección: " + abreviacion);


    }
}

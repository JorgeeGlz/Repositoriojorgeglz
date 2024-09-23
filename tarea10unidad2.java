//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String palabraEjercicio = " supercalifragilisticoespialidoso ";

        int longitud= palabraEjercicio.length();
        System.out.println("longitud : " + longitud);


        char posDiez = palabraEjercicio.charAt(10);
        System.out.println("caracter en posicion 10 :" + posDiez);


        String mayusculas = palabraEjercicio.toUpperCase();
        System.out.println("En mayusculas:" + mayusculas);

        String palabra = " supercalifragilisticoespialidoso ";
        String palabraCortada = palabra.substring(6,17);
        System.out.println("subcadena 5-15: a" + palabraCortada);

        String palabraNueva = " supercalifragilisticoespialidoso ";
        int primerOcurrencia = palabraNueva.indexOf('i') + 2;
        System.out.println("primera ocurrencia de i:" + primerOcurrencia);

        String otraPalabra =  " supercalifragilisticoespialidoso ";
        int ultimaOcurrencia = otraPalabra.lastIndexOf('o') + 1;
        System.out.println("ultimaOcurrencia de o:" + ultimaOcurrencia);

        String minusculas = palabraEjercicio.toLowerCase();
        System.out.println("minusculas:" + minusculas);

        String sieteFinal = palabraEjercicio.substring(7);
        System.out.println("subcadena desde la posicion 7 asta el final: " + sieteFinal );

        int ultimaLi = palabraEjercicio.lastIndexOf("li") - 6;
        System.out.println("ultima ocurrencia de li:" + ultimaLi);

        }
    }

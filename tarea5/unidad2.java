import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Ingrese su domicilio:");
System.out.println("Calle:");
String calle = imput.nextLine();
System.out.println("Número");
String numero = imput.nextLine();
System.out.println("Colonia");
String colonia = imput.nextLine();
System.out.println("Ciudad:");
String ciudad = imput.nextLine();
System.out.println("Codigo postal:");
String cp = imput.nextLine();

System.out.println("Nombre de la calle:" + calle);
System.out.println("Número de calle:" + numero);
System.out.println("Colonia:" + colonia);
System.out.println("Ciudad:" + ciudad);
System.out.println("Codigo Postal:" + cp);

System.out.println("Inrese los datos escolares");
System.out.println("Primaria");
System.out.println("Nombre de la primaria:");
String primaria = imput.nextLine();
System.out.println("Ubicación:");
String ubicacion = imput.nextLine();
System.out.println("Inicio");
String inicio = imput.nextLine();
System.out.println("Fin");
String fin = imput.nextLine();

System.out.println("Primaria: " + primaria);
System.out.println("Ubicacion: " + ubicacion);
System.out.println("Inicio del ciclo: " + inicio);
System.out.println("Fin del ciclo: " + fin);

System.out.println("Nombre de la Secundaria:");
String secundaria = imput.nextLine();
System.out.println("Ubicacion: ");
String ubicacionSecundaria = imput.nextLine();
System.out.println("Inicio");
String inicioSecundaria = imput.nextLine();
System.out.println("Fin");
String finSecundaria = imput.nextLine();

System.out.println("Secuandaia: " + secundaria);
System.out.println("Ubicacion Secundaria: " + ubicacionSecundaria);
System.out.println("Inicio Secundaria: " + inicioSecundaria);
System.out.println("Fin Secundaria: " + finSecundaria);

System.out.println("Nombre del bachillerato");
String bachillerato = imput.nextLine();
System.out.println("Ubicación del bachillerato: " + bachillerato);
String ubicacionBachillerato = imput.nextLine();
System.out.println("Inicio");
String inicioBachillerato = imput.nextLine();
System.out.println("Fin");
String finBachillerato = imput.nextLine();

System.out.println("Nombre del bachillerato: " + bachillerato);
System.out.println("Ubicacion Bachillerato: " + ubicacionBachillerato);
System.out.println("Inicio bachillerato: " + inicioBachillerato);
System.out.println("Fin bachillerato: " + finBachillerato);


System.out.println("Ingrese los datos de su deporte favorito");
System.out.println("Deporte:");
String deporte = imput.nextLine();
System.out.println("Equipo Favorito:");
String equipoFavorito = imput.nextLine();
System.out.println("Posicion favorita:");
String posicionFavorita = imput.nextLine();
System.out.println("Jugador Favorito:");
String jugadorFavorito = imput.nextLine();
System.out.println("Tiempo Jugando");
String tiempoJugando = imput.nextLine();

System.out.println("Deporte Favorito:" + deporte);
System.out.println("Equipo Favorito:" + equipoFavorito);
System.out.println("Posicion Favorita:" + posicionFavorita);
System.out.println("Jugador Favorito:" + jugadorFavorito);
System.out.println("Tiempo Jugando:" + tiempoJugando);
        }
    }

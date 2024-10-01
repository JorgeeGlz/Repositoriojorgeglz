//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       String palabra ="12345;Laptop HP Pavilion;1500.99;Electrónica";

       int longitud = palabra.length();
       System.out.println("Longitud de la cadena: " + longitud);

       String id = palabra.substring(0,5);
       System.out.println("Id del producto: " + id);

       String noProducto = palabra.substring(6,24);
       System.out.println("Nombre del producto: " + noProducto);

       String mayusculas = noProducto.toUpperCase();
       System.out.println("Nombre del producto en mayusculas: " + mayusculas);

       String precio = palabra.substring(25,32);
       System.out.println("Precio del producto: " + precio);

       char posDiez = palabra.charAt(11 );
       System.out.println("Caracter en la posicion 10 del nombre: " + posDiez);

       int primeraOcurrencia = noProducto.indexOf('a');
       System.out.println("Primera Ocurrencia de 'a': " + primeraOcurrencia);

       int ultimaOcurrenia = noProducto.lastIndexOf('o');
       System.out.println("Ultima ocurrencia de 'o': " + ultimaOcurrenia);

       String cadena = "1500.99;Electrónica";

       String precioCategoria =cadena.replace("1500.99;Electrónica","1500.99-Electónica");
       System.out.println("Precio y categoría: " + precioCategoria);

       String sucadena = palabra.substring(13,24);
       System.out.println("Sucadena desde la posicion 7 del nombre: " + sucadena);


        }
    }

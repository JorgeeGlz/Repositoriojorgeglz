import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Scanner imput = new Scanner(System.in);
System.out.println("Ingrese el nombre del producto 1 ");
String productoUno = imput.nextLine();
System.out.println("Ingrese la cantidad de productos");
int cantidadUno = imput.nextInt();
System.out.println("Ingrese el precio del producto");
double precioUno = imput.nextDouble();
System.out.println("Ingrese el porcentaje de descuento");
double descuentoUno = imput.nextDouble();
System.out.println("Ingrese los impuestos aplicables en porcentaje");
double porcentajeUno = imput.nextDouble();


System.out.println("Ingrese el nombre del producto 2");
String productoDos = imput.nextLine();
System.out.println("Ingrese la cantidad de productos");
int cantidadDos = imput.nextInt();
System.out.println("Ingrese el precio del producto");
double precioDos = imput.nextDouble();
System.out.println("Ingrese el porcentaje de descuento");
double descuentoDos = imput.nextDouble();
System.out.println("Ingrese los impuestos aplicables en descuento");
double porcentajeDos = imput.nextDouble();

System.out.println("Ingrese el nombre del producto 3");
String productoTres = imput.nextLine();
System.out.println("Ingrese la cantidad de productos");
int cantidadTres= imput.nextInt();
System.out.println("Ingrese el precio del producto");
double precioTres = imput.nextDouble();
System.out.println("Ingrese el porcentaje de descuento");
double descuentoTres = imput.nextDouble();
System.out.println("Ingrese los impuestos aplicables en descuento");
double porcentajeTres = imput.nextDouble();

System.out.println("Resumen del pedido:");
System.out.println("Producto:"+productoUno);
System.out.println("Cantidad de productos:"+cantidadUno);
double precioSinDescuentoUno = cantidadUno*precioUno;
System.out.println("Precio total sin descuento:" + precioSinDescuentoUno);
System.out.println("Descuento aplicado:" + descuentoUno*cantidadUno);
double precioDescuentoUno = precioUno*descuentoUno-descuentoUno;
System.out.println("Precio con descuento:" + precioDescuentoUno);
double impuestoUno = precioDescuentoUno*(porcentajeUno/100);
System.out.println("Impuesto aplicado:" +impuestoUno);
double totalUno = precioUno+impuestoUno + impuestoUno;
System.out.println("Total a pagar:"+ totalUno);

        System.out.println("Resumen del pedido:");
        System.out.println("Producto:"+ productoDos);
        System.out.println("Cantidad de productos:"+cantidadDos);
        double precioSinDescuentoDos = cantidadDos*precioDos;
        System.out.println("Precio total sin descuento:" + precioSinDescuentoDos);
        System.out.println("Descuento aplicado:" + descuentoDos*cantidadDos);
        double precioDescuentoDos = precioDos*descuentoDos-descuentoDos;
        System.out.println("Precio con descuento:" + precioDescuentoDos);
        double impuestoDos = precioDescuentoDos*(porcentajeDos/100);
        System.out.println("Impuesto aplicado:" +impuestoDos);
        double totalDos = precioUno+impuestoDos + impuestoDos;
        System.out.println("Total a pagar:"+ totalDos);


        System.out.println("Resumen del pedido:");
        System.out.println("Producto:"+ productoTres);
        System.out.println("Cantidad de productos:"+cantidadTres);
        double precioSinDescuentoTres = cantidadDos*precioTres;
        System.out.println("Precio total sin descuento:" + precioSinDescuentoTres);
        System.out.println("Descuento aplicado:" + descuentoTres*cantidadTres);
        double precioDescuentoTres = precioTres*descuentoTres-descuentoTres;
        System.out.println("Precio con descuento:" + precioDescuentoTres);
        double impuestoTres = precioDescuentoTres*(porcentajeTres/100);
        System.out.println("Impuesto aplicado:" +impuestoTres);
        double totalTres = precioTres+impuestoTres + impuestoTres;
        System.out.println("Total a pagar:"+ totalTres);
        










        }
    }

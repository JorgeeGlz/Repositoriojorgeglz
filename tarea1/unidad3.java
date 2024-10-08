//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    String nombre ="Carlos Martinez";
    String direccion = "192.168.0.1";
    int cliente = 12345;
    String palabra = nombre.replace("Carlos Martinez","1arl4s M4rt1n3z");

    String a = Integer.toHexString(192);
    String b = Integer.toHexString(168);
    String c = Integer.toHexString(0);
    String d = Integer.toHexString(1);
    String ip= (a+"."+b+"."+c+"."+d);

int clienteNo = (cliente*3+15)/2;
System.out.println(palabra+"|"+ip+"|"+clienteNo)
  

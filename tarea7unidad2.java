import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.println("10 numeros aleatorios");
int limiteMayor =100,limiteMenor =10;
double numUno = Math.random()*(limiteMayor-limiteMenor+1)+limiteMenor;
double numDos = Math.random()*(limiteMayor-limiteMenor+1)+limiteMenor;
double numTres = Math.random()*(limiteMayor-limiteMenor+1)+limiteMenor;
double numCuatro = Math.random()*(limiteMayor-limiteMenor+1)+limiteMenor;
double numCinco = Math.random()*(limiteMayor-limiteMenor+1)+limiteMenor;
double numSeis = Math.random()*(limiteMayor-limiteMenor+1)+limiteMenor;
double numSiete = Math.random()*(limiteMayor-limiteMenor+1)+limiteMenor;
double numOcho = Math.random()*(limiteMayor-limiteMenor+1)+limiteMenor;
double numNueve = Math.random()*(limiteMayor-limiteMenor+1)+limiteMenor;
double numDiez = Math.random()*(limiteMayor-limiteMenor+1)+limiteMenor;

System.out.println(numUno);
System.out.println(numDos);
System.out.println(numTres);
System.out.println(numCuatro);
System.out.println(numCinco);
System.out.println(numSeis);
System.out.println(numSiete);
System.out.println(numOcho);
System.out.println(numNueve);
System.out.println(numDiez);


System.out.println("Raíces");
double rUno = Math.sqrt(numUno);
double rDos = Math.sqrt(numDos);
double rTres = Math.sqrt(numTres);
double rCuatro = Math.sqrt(numCuatro);
double rCinco = Math.sqrt(numCinco);
double rSeis = Math.sqrt(numSeis);
double rSiete = Math.sqrt(numSiete);
double rOcho = Math.sqrt(numOcho);
double rNueve = Math.sqrt(numNueve);
double rDiez = Math.sqrt(numDiez);

System.out.println(rUno);
System.out.println(rDos);
System.out.println(rTres);
System.out.println(rCuatro);
System.out.println(rCinco);
System.out.println(rSeis);
System.out.println(rSiete);
System.out.println(rOcho);
System.out.println(rNueve);
System.out.println(rDiez);

System.out.println("Potencias");
double pUno = Math.pow(numUno,2);
double pDos = Math.pow(numDos,2);
double pTres = Math.pow(numTres,2);
double pCuatro = Math.pow(numCuatro,2);
double pCinco = Math.pow(numCinco,2);
double pSeis = Math.pow(numSeis,2);
double pSiete = Math.pow(numSiete,2);
double pOcho = Math.pow(numOcho,2);
double pNueve = Math.pow(numNueve,2);
double pDiez = Math.pow(numDiez,2);

System.out.println(pUno);
System.out.println(pDos);
System.out.println(pTres);
System.out.println(pCuatro);
System.out.println(pCinco);
System.out.println(pSeis);
System.out.println(pSiete);
System.out.println(pOcho);
System.out.println(pNueve);
System.out.println(pDiez);

System.out.println("Media");
double media =(numUno+numDos+numTres+numCuatro+numCinco+numSeis+numSiete+numOcho+numNueve+numDiez)/10;
System.out.println(media);

System.out.println("Desviacion estandar");
double resta = numUno-media;
double restaDos = numDos-media;
double restaTres = numTres-media;
double restaCuatro = numCuatro-media;
double restaCinco = numCinco-media;
double restaSeis = numSeis-media;
double restaSiete = numSiete-media;
double restaOcho = numOcho-media;
double restaNueve = numNueve-media;
double restaDiez = numDiez-media;

double desUno = Math.pow(resta,2);
double desDos = Math.pow(restaDos,2);
double desTres = Math.pow(restaTres,2);
double desCuatro = Math.pow(restaCuatro,2);
double desCinco = Math.pow(restaCinco,2);
double desSeis = Math.pow(restaSeis,2);
double desSiete = Math.pow(restaSiete,2);
double desOcho = Math.pow(restaOcho,2);
double desNueve = Math.pow(restaNueve,2);
double desDiez = Math.pow(restaDiez,2);

double sumaTotal= desUno+desDos+desTres+desCuatro+desCinco+desSeis+desSiete+desOcho+desNueve+desDiez;
double division = sumaTotal/10;
double desviacionEstandar = Math.sqrt(division);
System.out.println(desviacionEstandar);



    }
}

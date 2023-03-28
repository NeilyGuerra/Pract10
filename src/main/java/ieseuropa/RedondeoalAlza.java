package main.java.ieseuropa;
import java.text.DecimalFormat;
import java.util.*;
public class RedondeoalAlza {

	 public static double redondearDecimales(double valorInicial, int numeroDecimales) {	
	 double parteEntera, resultado;
     resultado = valorInicial;
     parteEntera = Math.floor(resultado);
     resultado=(resultado-parteEntera)*Math.pow(10, numeroDecimales);
     resultado=Math.round(resultado);
     resultado=(resultado/Math.pow(10, numeroDecimales))+parteEntera;
     return resultado;
 }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);

System.out.println("Introduce un numero con varios decimales");
double num = sc.nextDouble();
System.out.println("cuantos decimales quieres dejar");
int numDecimales=sc.nextInt();


System.out.println(redondearDecimales(num,numDecimales));
	}

}

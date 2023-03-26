package main.java.ieseuropa;
import java.util.*;

public class EliminarDecimales {
	
	public static double formatearDecimales(Double numero, Integer numeroDecimales) {
		return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introducir un numero con muchos decimales");
		double num = sc.nextDouble();
		
		System.out.println("Cuantos decimales desea que tenga el num");
		int decimales=sc.nextInt();
		
		System.out.println(formatearDecimales (num,decimales));
		
	}

}

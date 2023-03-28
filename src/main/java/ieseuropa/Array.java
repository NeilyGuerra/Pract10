package main.java.ieseuropa;

import java.util.Arrays;

public class Array {
	
	public static double calcularMinimo(double[] numeros) {
	    double minimo = numeros[0];
	    for (int i = 1; i < numeros.length; i++) {
	        if (numeros[i] < minimo) {
	            minimo = numeros[i];
	        }
	    }
	    return minimo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[]a = {1,2,4,6};
		
		System.out.print(calcularMinimo(a));
	}

}

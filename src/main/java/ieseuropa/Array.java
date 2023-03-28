package main.java.ieseuropa;

import java.util.Arrays;

public class Array {
	
	public static double calcularMediana(double[] numeros) {
	    Arrays.sort(numeros);
	    int mitad = numeros.length / 2;
	    if (numeros.length % 2 == 0) {
	        return (numeros[mitad - 1] + numeros[mitad]) / 2;
	    } else {
	        return numeros[mitad];
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola");
	}

}

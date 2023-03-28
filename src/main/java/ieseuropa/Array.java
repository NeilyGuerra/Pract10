package main.java.ieseuropa;

import java.util.Arrays;

public class Array {
	
	public static void ordenarArray(double[] numeros) {
	    Arrays.sort(numeros);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numeros = {7.8, 5.6, 3.4, 1.2};
		ordenarArray(numeros);
		System.out.println("El array ordenado es: " + Arrays.toString(numeros));
	}

}

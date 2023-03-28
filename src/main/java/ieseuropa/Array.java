package main.java.ieseuropa;

import java.util.Arrays;

public class Array {
 
	public static void generarMaximo(double[]numeros) {
	    
	    double maximo = 0;
	    for (int i = 0; i < numeros.length; i++) {
	        numeros[i] = (int)(Math.random() * 50) + 1;
	        if (numeros[i] > maximo) {
	            maximo = numeros[i];
	        }
	    }
	    
	    System.out.println("Los números generados son: " + Arrays.toString(numeros));
	    System.out.println("El valor máximo es: " + maximo);
	
	}
	public static void ordenarArray(double[] numeros) {
	    Arrays.sort(numeros);
	}	

	public static double calcularMinimo(double[] numeros) {
	    double minimo = numeros[0];
	    for (int i = 1; i < numeros.length; i++) {
	        if (numeros[i] < minimo) {
	            minimo = numeros[i];
	        }
	    }
	    return minimo;
	}

	public static double calcularMediana(double[] numeros) {
	    Arrays.sort(numeros);
	    int mitad = numeros.length / 2;
	    if (numeros.length % 2 == 0) {
	        return (numeros[mitad - 1] + numeros[mitad]) / 2;
	    } else {
	        return numeros[mitad];
	    }
	}

	public static double calcularMedia(double[] numeros) {
	    double suma = 0;
	    for (int i = 0; i < numeros.length; i++) {
	        suma += numeros[i];
	    }
	    return suma / numeros.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[]numeros = {1,2,3,4,5,6,7,8,9};

		System.out.println(calcularMediana(numeros));
		System.out.println(calcularMedia(numeros));
		System.out.println(calcularMinimo(numeros));
		ordenarArray(numeros);
		System.out.println("El array ordenado es: " + Arrays.toString(numeros));
		generarMaximo(numeros);

	}

}

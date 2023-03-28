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
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	}

}

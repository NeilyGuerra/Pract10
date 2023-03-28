package main.java.ieseuropa;

public class Array {
	
	public static double calcularMedia(double[] numeros) {
	    double suma = 0;
	    for (int i = 0; i < numeros.length; i++) {
	        suma += numeros[i];
	    }
	    return suma / numeros.length;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola");
	}

}

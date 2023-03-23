
package main.java.ieseuropa;

import java.util.Arrays;

public class Numeros {
	private static int[] calcularSeriePell() {
		int[] seriePell = new int[15];
		seriePell[0]=0;
		seriePell[1] = 1;
		for (int i = 2; i < 15; i++) {
	        seriePell[i] = 2 * seriePell[i-1] + seriePell[i-2];
	    }
		return seriePell;
	}
	private static boolean esAmstrong(int numero) {
		int longitud = String.valueOf(numero).length(), suma = 0, aux = numero;
		while(aux != 0) {
			int digito = aux % 10;
			suma += Math.pow(digito, longitud);
			aux /=  10;
		}
		System.out.println("Num OG " + numero);
		System.out.println("Suma " + suma);
		if(suma == numero)return true;
		else return false;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(calcularSeriePell()));
		int num = 153;
		if(esAmstrong(num)) System.out.println("El número " + num + " es un número Amstrong.");
		else System.out.println("El número " + num + " no es un número Amstrong.");
	}

}


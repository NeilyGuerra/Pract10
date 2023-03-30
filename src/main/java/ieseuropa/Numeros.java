
package main.java.ieseuropa;

import java.util.Arrays;
import java.util.Scanner;

public class Numeros {
	private static int pedirInt(String texto) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println(texto);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Debe introducir un numero entero, por favor: ");
		}
		num = sc.nextInt();
		sc.nextLine();
		return num;
	}
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
		if(suma == numero)return true;
		else return false;
	}

	private static int factorial(int num) {
		int resultado=1;
		for(int i = num;i>1;i--) {
			resultado*= i;
		}
		return resultado;
	}
	private static boolean esPrimo (int num) {
		for(int i=2 ;i<num;i++) {
			if(num%i==0) 
				return false ;	
		}
		return true;
	}
	private static void horasMinutosSegundos(int segundos) {
		System.out.print("Horas: "+(segundos/3600));
		System.out.print(" Minutos: "+(segundos%3600)/60);
		System.out.println(" Segundos: "+(segundos % 60));
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(calcularSeriePell()));
		int num = pedirInt("Introduzca un número:");
		if(esAmstrong(num)) System.out.println("El número " + num + " es un número Amstrong.");
		else System.out.println("El número " + num + " no es un número Amstrong.");
		
		int factorial = 3;
		System.out.println("El factorial de "+factorial+" es "+factorial(factorial));
		int primo = 5;
		System.out.println("es "+primo+" primo: "+esPrimo(primo));
		
		horasMinutosSegundos(3680);
	}

}


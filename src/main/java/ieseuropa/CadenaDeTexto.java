
package main.java.ieseuropa;

import java.util.Scanner;

public class CadenaDeTexto {
	private static String pedirString(String texto) {
		Scanner sc = new Scanner(System.in);
		System.out.print(texto);		
		return sc.nextLine();		
	}
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
	private static void repetirStrings(String Str1, String Str2, int num) {
		for(int i = 0; i < num; i++) {
			System.out.println(Str1);
			System.out.println(Str2);
		}
	}
	private static String repetirLetra(String palabra) {
		return palabra.replaceAll(".", "$0$0");
	}
	public static String borrarApariciones(String str1, String str2) {
	    String str1minus = str1.toLowerCase();
	    String str2minus = str2.toLowerCase();
	    String resultado = str1minus.replaceAll(str2minus, "");
	    return resultado;
	}
	private static int longitudNombre(String nombre) {
		return nombre.length();
	}
	private static int ocurrenciasLetra(String cadena, char letra) {
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == letra)
				contador++;
		}
		return contador;
	}
	public static void main(String[] args) {
		String str1 = "Este es el primer String.";
		String str2 = "Este es el segundo String. ";
		repetirStrings(str1, str2, pedirInt("Introduzca la cantidad de veces que quiere que se repitan los Strings."));
		System.out.println(repetirLetra(pedirString("Introduzca la palabra:")));
		String str3 = pedirString("Introduzca la palabra:");
		String str4 = pedirString("Introduzca el texto:");
		System.out.println(borrarApariciones(str4, str3).trim());
		
		System.out.println(longitudNombre(str4));
		
		System.out.println(ocurrenciasLetra(str4, 'e'));
	}

}


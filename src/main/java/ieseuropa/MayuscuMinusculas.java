package main.java.ieseuropa;
import java.util.*;
public class MayuscuMinusculas {
	
	public static String Mayusculas(String texto) {
		return texto.toUpperCase();
		}
	
	public static String Minusculas (String texto) {
		return texto.toLowerCase();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);

System.out.println("texto en minuscula a mayuscula ");
String Mi_cadena= "todo sacrificio tiene su recompensa";
System.out.print(Mayusculas(Mi_cadena));
System.out.println();

System.out.println("texto en mayuscula  a minusculas ");
String Micadena2="CON CONSTANCIA Y DISCPLINA TODO SE PUEDE";
System.out.print(Minusculas(Micadena2));

	}
	}



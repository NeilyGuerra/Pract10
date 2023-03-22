package main.java.ieseuropa;

public class CadenaDeTexto {
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

	public static void main(String[] args) {
		String str1 = "Este es el primer String.";
		String str2 = "Este es el segundo String.";
		repetirStrings(str1, str2, pedirInt("Introduzca la cantidad de veces que quiere que se repitan los Strings."));
		System.out.println(repetirLetra("NBA"));
		String str3 = "Real";
		String str4 = "Real Zaragoza es de la realeza";
		System.out.println(borrarApariciones(str4, str3).trim());
	}

}

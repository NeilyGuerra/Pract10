package main.java.ieseuropa;

public class Numero {
	
	private static boolean esPrimo (int num) {
		boolean esPrimo= true;
		for(int i=2 ;i<num;i++) {
			if(num%i==0) 
				return false ;	
		}
		return true;
	}
	public static void main(String[] args) {
		
		int primo = 5;
		System.out.println("es "+primo+" primo: "+esPrimo(primo));
		
	}

}

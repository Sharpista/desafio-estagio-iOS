package br.com.mobicare.algoritmos;

public class Exercicio1 {

	public static void main(String[] args) {
		
		
		String[] a = {"a", "b", "c"};
		String[] b = {"a", "b", "c"};
		
		
		System.out.println(compararArray(a, b));
	
	}
	
	public static boolean compararArray(String[]a, String[] b) {
		
		for(int i =0 ; i < a.length; i++) {
			
			if(a[i] != b[i]) {
				
				return false;
			}
		}
		
		return true;
		
		
	}

}

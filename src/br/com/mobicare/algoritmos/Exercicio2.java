package br.com.mobicare.algoritmos;

public class Exercicio2 {

	public static void main(String[] args) {
		
		double[] array = {1.0, 2.0, 3.0};
		
		
		System.out.println(somarArray(array));
		
		
		
	}
	public static double somarArray(double[] arrayDouble) {
		
		double total = 0.0;
		for(int i = 0; i < arrayDouble.length; i++) {
			total += arrayDouble[i];
		}
		return total;
	}

}

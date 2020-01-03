package br.com.mobicare.algoritmos;

public class Exercicio4 {

	public static void main(String[] args) {
		
		
		int[] vect = {1,2,3,5,7};
		
		somarImparesEMultiplicar(vect);
	}
	public static void somarImparesEMultiplicar(int[] array) {
		
		int soma = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 1) {
				soma+= array[i];
			}
		}
		System.out.println(soma);
		for(int i = 0; i < array.length;i++) {
			if(array[i] % 2 == 0) {
				soma*= array[i];
			}
		}
		System.out.println(soma);
	}
	
}

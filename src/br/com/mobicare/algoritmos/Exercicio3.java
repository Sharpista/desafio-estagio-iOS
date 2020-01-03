package br.com.mobicare.algoritmos;

import java.lang.reflect.Array;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int[] vect = {1,2,5,4,0,3};
		
		ordenarVetor(vect);
		

	}
	public static void ordenarVetor(int[] array) {
	
		int maior = array[0];
		int menor = array[0];
		int soma = 0;
		for(int i=0; i < array.length;i++) {
			
			if(array[i] > maior) {
				maior = array[i];
				
			}
		}
		for(int i = 0; i < array.length;i++) {
			if(array[i] < menor) {
				menor = array[i];
				
			}
		}
		
		soma = maior + menor;
		
		for(int k = 0; k < array.length; k++) {
			
			if(array[k] % 5 == 0 || array[k] % 7 == 0) {
				
				soma += array[k];
			}
		}
		System.out.println(soma);
	
		
			
		

	
		
	}

}

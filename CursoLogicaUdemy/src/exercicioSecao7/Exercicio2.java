package exercicioSecao7;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		for(int i = 1 ;i<=100; i++) {
			System.out.println(i);
			if(i % 10 == 0) {
				System.out.println("Multiplo de 10:" + i);
			}
		} 
		
	}

}
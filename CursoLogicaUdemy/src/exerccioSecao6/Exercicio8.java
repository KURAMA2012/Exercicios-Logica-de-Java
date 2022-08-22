package exerccioSecao6;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um valor");
		int valor = leitor.nextInt();
		
		if(valor > 0 && valor%2 == 0) {
			System.out.println("Valor positivo e par");
		}else if(valor > 0 && valor%2 != 0) {
			System.out.println("Valor positivo e ímpar");
		}else if(valor < 0 && valor%2 == 0) {
			System.out.println("Valor negativo e par");
		}else {
			System.out.println("Valor negativo ímpar");
		}

	}

}

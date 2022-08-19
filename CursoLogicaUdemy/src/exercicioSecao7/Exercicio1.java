package exercicioSecao7;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite N valores: ");

		int maior = 0;
		int valor = leitor.nextInt();

		while (valor != 0) {
			if (valor > maior) {
				maior = valor;
			}
			valor = leitor.nextInt();
			if(valor == 0) {
				System.out.println("Maior valor: " + Math.max(maior, valor));
			}
		}

	}

}

package exercicioSecao7;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite 10 valores: ");

		int valor = leitor.nextInt();
		int maior = 0;
		int menor = 2147483647;
		int soma = 0;

		while (valor != 0) {
			if (valor > maior) {
				maior = valor;
			}

			if (valor < menor) {
				menor = valor;
			}

			valor = leitor.nextInt();
			soma = soma + valor;
			boolean finalizar = leitor.hasNextBoolean();
			
			if (finalizar == true) {
				System.out.println("Maior valor: " + Math.max(maior, valor));
				System.out.println("Menor valor: " + Math.min(maior, menor));

				int media = soma / 10;

				System.out.println("Media : " + media);
			}
		}
	}

}

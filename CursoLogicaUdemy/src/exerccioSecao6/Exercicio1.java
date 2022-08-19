package exerccioSecao6;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int valor = leitor.nextInt();

		if (valor > 100) {
			System.out.println(valor);
		} else if (valor < 100) {
			valor = 0;
			System.out.println(valor);
		} else if (valor == 100) {
			valor = 0;
			System.out.println(valor);
		}
	}

}

package exerccioSecao6;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite sua altura: ");
		double altura = leitor.nextDouble();

		System.out.println("Digite seu sexo, 1 para(Masculino) e 2 para (Feminino): ");
		int sexo1 = leitor.nextInt();

		double media = 0;

		if (altura != 0) {
			if (sexo1 == 1 ) {
				double parametroHomem = 72.7;
				double parametroHomem1 = 58;
				media = (altura * parametroHomem) - parametroHomem1;
				System.out.println("Media :" + media);
			} else if (sexo1 == 2) {
				double parametroMulher = 62.2;
				double parametroMulher1 = 44.7;
				media = (altura * parametroMulher) - parametroMulher1;
				System.out.println("Media :" + media);
			}
		}
	}
}

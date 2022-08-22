package exerccioSecao6;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.println("Iniciar propgrama? digite true para iniciar.");
		boolean iniciar = leitor.nextBoolean();

		if (iniciar == true) {
			System.out.println("Vamos calcular os quadrados dos seguintes numeros.");
			System.out.println("Digite um valor1:");
			int valor1 = leitor.nextInt();
			int calculo1 = valor1 * valor1;
			System.out.println("Quadrado do valor1: " + calculo1);

			System.out.println("Digite um valor2:");
			int valor2 = leitor.nextInt();
			int calculo2 = valor2 * valor2;
			System.out.println("Quadrado do valor2: " + calculo2);

			System.out.println("Digite um valor3:");
			int valor3 = leitor.nextInt();
			int calculo3 = valor3 * valor3;
			if (calculo3 >= 1000) {
				System.out.println("Quadrado do valor3: " + calculo3);
			}else {
				System.out.println("Quadrado do valor3: " + calculo3);
				System.out.println("Digite um valor4:");
				int valor4 = leitor.nextInt();
				int calculo4 = valor4 * valor4;
				System.out.println("Quadrado do valor4: " + calculo4);
			}
		}

	}

}

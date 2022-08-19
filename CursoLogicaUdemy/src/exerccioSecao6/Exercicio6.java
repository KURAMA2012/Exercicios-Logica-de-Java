package exerccioSecao6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		int codigo;
		double numeroDeHorasTrabalhadas;
		double salario;
		double excesso;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o código do funcionário: ");
		codigo = leitor.nextInt();

		System.out.println("Numero de Horas Trabalhadas: ");
		numeroDeHorasTrabalhadas = leitor.nextDouble();

		if (numeroDeHorasTrabalhadas > 50) {
			System.out.println("Excesso de horas:");
			excesso = numeroDeHorasTrabalhadas - 50;
			salario = (numeroDeHorasTrabalhadas - excesso) * 10.00;
			System.out.println(excesso);

			System.out.println("Salario");
			salario = salario + (excesso * 20.00);
			System.out.println(salario);

		}

	}

}

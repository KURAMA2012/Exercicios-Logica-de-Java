package exercicioSecao7;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		String usuario = null;
		String senha = null;
		boolean cadastro = false;

		do {
			if (cadastro == false) {
				System.out.println("Digite seu usuario:");
				usuario = leitor.next();

				System.out.println("Digite sua senha:");
				senha = leitor.next();
			}
			if (usuario.equalsIgnoreCase(senha)) {
				cadastro = false;
				System.out.println("Erro Usuario e Senha nao podem ser iguais!");

			} else if (usuario != senha) {
				cadastro = true;
				System.out.println("Cadastro realizado!");
				break;
			}
		} while (usuario != senha);

	}
}

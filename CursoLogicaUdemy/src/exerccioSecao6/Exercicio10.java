package exerccioSecao6;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Iniciar teste? digite true");
		boolean iniciar = leitor.nextBoolean();
		
		System.out.println("Digite sua idade:");
		int idade = leitor.nextInt();
		
		if(iniciar == true) {
			if(idade  >=5 && idade <=7) {
				System.out.println("Categoria infantil -a");
			}
			
			if(idade >= 8 && idade <=11 ) {
				System.out.println("Categoria infantil -b");
			}
			
			if(idade >= 12 && idade <= 13) {
				System.out.println("Categoria juvenil -a");
			}
			
			if(idade >= 14 && idade <= 17) {
				System.out.println("Categoria juvenil -b");
			}
			
			if(idade >= 18 ) {
				System.out.println("Categoria adulto");
			}
		}
		
		

	}

}

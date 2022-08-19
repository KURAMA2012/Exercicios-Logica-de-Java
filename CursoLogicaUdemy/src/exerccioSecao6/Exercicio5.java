package exerccioSecao6;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		double excesso = 00.00;
		double multa = 04.00;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Peso dos peixes em Kg: ");
		double pesoDePeixes = leitor.nextDouble();
		
		if(pesoDePeixes > 50) {
			excesso = pesoDePeixes - 50;
			System.out.println("Excesso de Kg em peixe " + excesso);
			
			if(excesso > 50) {
				System.out.println("Calculando valor da multa");
				double valorTotalDaMulta =	excesso * multa;
				System.out.println(valorTotalDaMulta);
				}
			}else {
				excesso = 00.00;
				multa = 00.00;
				System.out.println("Excesso: " + excesso + "  Multa: " + multa);
			}
		}
		
	}



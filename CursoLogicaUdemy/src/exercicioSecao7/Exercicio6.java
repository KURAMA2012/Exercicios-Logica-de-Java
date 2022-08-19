package exercicioSecao7;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Qual tabuada da multiplicacao de deseja?");
		int numeroMultiplicador = leitor.nextInt();
		
		for(int i = 1; i<=10; i++) {
			int produto = numeroMultiplicador * i;
			System.out.println(numeroMultiplicador + "x" + i +"=" + produto);
		}
	}

}

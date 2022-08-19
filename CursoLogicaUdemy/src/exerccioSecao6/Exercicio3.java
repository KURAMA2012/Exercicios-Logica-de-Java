package exerccioSecao6;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int valor = leitor.nextInt();
		boolean fim = false;
		int par = 0;
		int impar = 0;
		
		while(valor != 0 || fim == true) {
			if(valor % 2 == 0) {
				 par = valor;
				System.out.println("Par");
			}else if(valor % 2 != 0) {
				 impar = valor;
				System.out.println("Impar");
			}
			
			System.out.println(impar + par);
			break;
		}
		
		
	}

}

package exerccioSecao6;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int valor = leitor.nextInt();
		
		if(valor >0) {
			int a = valor;
			System.out.println("Valor Positivo" + valor);
		}else if(valor <0){
			int b = valor;
			System.out.println("Valor Negativo" + valor);
		}
	}

}

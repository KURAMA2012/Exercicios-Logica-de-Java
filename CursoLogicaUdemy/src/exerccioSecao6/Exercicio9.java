package exerccioSecao6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		ArrayList<String> grupoDeEmpresas1 = new ArrayList<String>();
		grupoDeEmpresas1.add("empresa1");
		grupoDeEmpresas1.add("empresa2");
		grupoDeEmpresas1.add("empresa3");

		ArrayList<String> grupoDeEmpresas2 = new ArrayList<String>();
		grupoDeEmpresas2.add("empresa4");
		grupoDeEmpresas2.add("empresa5");
		grupoDeEmpresas2.add("empresa6");

		ArrayList<String> grupoDeEmpresas3 = new ArrayList<String>();
		grupoDeEmpresas3.add("empresa7");
		grupoDeEmpresas3.add("empresa8");
		grupoDeEmpresas3.add("empresa9");

		ArrayList<ArrayList<String>> grupoIndustrial = new ArrayList<ArrayList<String>>();
		grupoIndustrial.add(grupoDeEmpresas1);
		grupoIndustrial.add(grupoDeEmpresas2);
		grupoIndustrial.add(grupoDeEmpresas3);

		Scanner leitor = new Scanner(System.in);
		double indiceDePoluicao = leitor.nextDouble();

		if (indiceDePoluicao == 00.30) {
			grupoIndustrial.indexOf(grupoDeEmpresas1.add("Suspender Grupo1"));
			System.out.println(grupoDeEmpresas1);
		} else if (indiceDePoluicao == 00.40) {
			grupoIndustrial.indexOf(grupoDeEmpresas1.add("Suspender Grupo1"));
			grupoIndustrial.indexOf(grupoDeEmpresas2.add("Suspender Grupo2"));
			System.out.println(grupoDeEmpresas1);
			System.out.println(grupoDeEmpresas2);
		} else if (indiceDePoluicao == 0.5) {
			grupoIndustrial.indexOf(grupoDeEmpresas1.add("Suspender Grupo1"));
			grupoIndustrial.indexOf(grupoDeEmpresas2.add("Suspender Grupo2"));
			grupoIndustrial.indexOf(grupoDeEmpresas3.add("Suspender Grupo3"));
			System.out.println(grupoIndustrial.toString());

		}

	}

}

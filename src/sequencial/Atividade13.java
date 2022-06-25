package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Atividade13 {

	public static void main(String[] args) {
		/*
		 * Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo
		 * que calcule seu peso ideal, utilizando as seguintes fórmulas: Para homens:
		 * (72.7*h) - 58 Para mulheres: (62.1*h) - 44.7
		 * 
		 */

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double pesoIdealH;
		double pesoIdealM;

		System.out.println("Digite [ 1 ] para homens é [ 2 ] para mulheres.");
		int resp = input.nextInt();

		if (resp == 1) {
			System.out.println("Digite sua altura:");
			double altura = input.nextDouble();
			pesoIdealH = (72.7 * altura) - 58;
			System.out.printf("O seu peso ideal é de: %.1f Kg \n", pesoIdealH);

		} else if (resp == 2) {
			System.out.println("Digite a sua altura:");
			double altura2 = input.nextDouble();
			pesoIdealM = (62.1 * altura2) - 44.7;
			System.out.printf("O seu peso ideal é de: %.1f Kg \n", pesoIdealM);
			
		} else if(resp < 1 || resp > 2) {
			System.out.println("Comando inválido...");
		}

		input.close();
	}

}

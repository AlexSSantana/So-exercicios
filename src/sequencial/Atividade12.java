package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
		/*
		 * Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
		 * calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
		 * 
		 */

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.print("Digite a sua altura: ");
		double altura = input.nextDouble();

		double pesoIdeal = (72.7 * altura) - 58;

		System.out.printf("O seu peso ideal é de: %.1f Kg", pesoIdeal);

		input.close();

	}

}

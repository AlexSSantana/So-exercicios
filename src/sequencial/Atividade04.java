package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que digite as 4 notas bimestrais e calcule a média
		 */
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("infome quatro notas:");
		double nota1 = input.nextDouble();
		double nota2 = input.nextDouble();
		double nota3 = input.nextDouble();
		double nota4 = input.nextDouble();

		double media = (nota1 + nota2 + nota3 + nota4) / 4.0;
		System.out.printf("A média calculada é: %.1f\n", media);
		input.close();
	}

}

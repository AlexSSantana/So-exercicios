package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que peça 2 números inteiros e um número real. Calcule e
		 * mostre: o produto do dobro do primeiro com metade do segundo . a soma do
		 * triplo do primeiro com o terceiro. o terceiro elevado ao cubo.
		 * 
		 */

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Digite dois números inteiros:");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		System.out.println("Digite um número real");
		double n3 = input.nextDouble();

		double produto = n1 * n1 * (n2 / 2.0);
		double soma = (n1 * 3) + n3;
		double cubo = Math.pow(n3, 3);

		System.out.printf("O produto do dobro do primeiro com metade do segundo: %.1f\n", produto);
		System.out.printf("A soma do triplo do primeiro com o terceiro: %.1f\n", soma);
		System.out.printf("O terceiro elevado ao cubo: %.1f\n", cubo);

		input.close();

	}

}

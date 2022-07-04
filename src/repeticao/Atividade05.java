package repeticao;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		/*
		 * Supondo que a população de um país A seja da ordem de 80000 habitantes com
		 * uma taxa anual de crescimento de 3% e que a população de B seja 200000
		 * habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule
		 * e escreva o número de anos necessários para que a população do país A
		 * ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
		 */

		Scanner input = new Scanner(System.in);

		double a = 80000;
		double b = 200000;
		int ano = 0;

		while (a < b) {
			a = a + (a * (double) (3 / 100));
			b = b + (b * (double) (1.5 / 100));
			ano = ano + 1;
			System.out.println(a);
			System.out.println(b);
			System.out.println("\n\n\n\n");
		}
		System.out.println(ano);
		input.close();
	}

}

package repeticao;

import java.util.Scanner;

public class Atividade09 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade
		 * de números pares e a quantidade de números impares.
		 */

		Scanner input = new Scanner(System.in);

		int number;
		int par = 0;
		int impar = 0;

		System.out.println("Digite 10 números inteiros");
		for (int i = 0; i < 10; i++) {
			number = input.nextInt();
			if (number % 2 == 0) {
				par = par + 1;
			} else {
				impar = impar + 1;
			}
		}
		System.out.println("Quantidades de números pares é: " + par);
		System.out.println("Quantidade de números ímpares é: " + impar);

		input.close();
	}

}

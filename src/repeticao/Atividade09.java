package repeticao;

import java.util.Scanner;

public class Atividade09 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que pe�a 10 n�meros inteiros, calcule e mostre a quantidade
		 * de n�meros pares e a quantidade de n�meros impares.
		 */

		Scanner input = new Scanner(System.in);

		int number;
		int par = 0;
		int impar = 0;

		System.out.println("Digite 10 n�meros inteiros");
		for (int i = 0; i < 10; i++) {
			number = input.nextInt();
			if (number % 2 == 0) {
				par = par + 1;
			} else {
				impar = impar + 1;
			}
		}
		System.out.println("Quantidades de n�meros pares �: " + par);
		System.out.println("Quantidade de n�meros �mpares �: " + impar);

		input.close();
	}

}

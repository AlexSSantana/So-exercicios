package decisao;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		/*
		 * Fa�a um Programa que pe�a um valor e mostre na tela se o valor � positivo ou
		 * negativo.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Dgite qualquer n�mero");
		int n = input.nextInt();

		if (n < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Positivo");
		}

		input.close();

	}

}

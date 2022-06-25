package decisao;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que peça dois números e imprima o maior deles.
		 */

		Scanner input = new Scanner(System.in);

		int n1 = input.nextInt();
		int n2 = input.nextInt();

		if (n1 > n2) {
			System.out.println(n1 + " é o maior número");
		} else {
			System.out.println(n2 + " é o maior número");
		}

		input.close();

	}

}

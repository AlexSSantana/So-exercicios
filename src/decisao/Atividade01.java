package decisao;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		/*
		 * Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.
		 */

		Scanner input = new Scanner(System.in);

		int n1 = input.nextInt();
		int n2 = input.nextInt();

		if (n1 > n2) {
			System.out.println(n1 + " � o maior n�mero");
		} else {
			System.out.println(n2 + " � o maior n�mero");
		}

		input.close();

	}

}

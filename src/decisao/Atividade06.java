package decisao;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		/*
		 * Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.
		 */

		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if (a > b && a > c) {
			System.out.println(a + " Maior n�mero");
		} else if (b > a && b > c) {
			System.out.println(b + " Maior n�mero");
		} else {
			System.out.println(c + " Maior n�mero");
		}
		input.close();
	}

}

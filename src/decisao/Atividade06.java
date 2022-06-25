package decisao;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que leia três números e mostre o maior deles.
		 */

		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if (a > b && a > c) {
			System.out.println(a + " Maior número");
		} else if (b > a && b > c) {
			System.out.println(b + " Maior número");
		} else {
			System.out.println(c + " Maior número");
		}
		input.close();
	}

}

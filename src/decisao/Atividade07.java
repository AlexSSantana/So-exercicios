package decisao;

import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		/*
		 * Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor deles.
		 * 
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
		if (a < b && a < c) {
			System.out.println(a + " Menor n�mero");
		} else if (b < a && b < c) {
			System.out.println(b + " Menor n�mero");
		} else {
			System.out.println(c + " Menor n�mero");
		}
		input.close();

	}

}

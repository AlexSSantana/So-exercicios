package sequencial;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa que pe�a dois n�meros inteiros e imprima a soma deles.
		 */
		Scanner input = new Scanner(System.in);

		System.out.print("Informe um n�mero inteiro: ");
		int n1 = input.nextInt();
		System.out.print("Informe outro n�mero inteiro: ");
		int n2 = input.nextInt();

		int soma = n1 + n2;

		System.out.println("A soma de " + n1 + " + " + n2 + " = " + soma);
		input.close();
	}

}

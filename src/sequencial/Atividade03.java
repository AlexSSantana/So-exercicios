package sequencial;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que peça dois números inteiros e imprima a soma deles.
		 */
		Scanner input = new Scanner(System.in);

		System.out.print("Informe um número inteiro: ");
		int n1 = input.nextInt();
		System.out.print("Informe outro número inteiro: ");
		int n2 = input.nextInt();

		int soma = n1 + n2;

		System.out.println("A soma de " + n1 + " + " + n2 + " = " + soma);
		input.close();
	}

}

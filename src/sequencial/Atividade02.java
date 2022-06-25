package sequencial;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que que pessa um número inteiro e depois mostre o número
		 * digitado na tela.
		 */
		Scanner input = new Scanner(System.in);

		System.out.print("Informe um número: ");
		int n = input.nextInt();

		System.out.println("O número digitado foi: " + n);
		input.close();
	}

}

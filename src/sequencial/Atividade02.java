package sequencial;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que que pessa um n�mero inteiro e depois mostre o n�mero
		 * digitado na tela.
		 */
		Scanner input = new Scanner(System.in);

		System.out.print("Informe um n�mero: ");
		int n = input.nextInt();

		System.out.println("O n�mero digitado foi: " + n);
		input.close();
	}

}

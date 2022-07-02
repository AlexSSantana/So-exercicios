package repeticao;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma mensagem
		 * caso o valor seja inv�lido e continue pedindo at� que o usu�rio informe um
		 * valor v�lido.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Digite uma nota entre 0 a 10:");
		int nota = input.nextInt();

		while (nota < 0 || nota > 10) {
			System.out.println("Nota inv�lida");
			System.out.println();
			System.out.println("Digite uma nota entre 0 a 10:");
			nota = input.nextInt();
		}
		System.out.println("Fim da execu��o...");
		input.close();

	}

}

package repeticao;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem
		 * caso o valor seja inválido e continue pedindo até que o usuário informe um
		 * valor válido.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Digite uma nota entre 0 a 10:");
		int nota = input.nextInt();

		while (nota < 0 || nota > 10) {
			System.out.println("Nota inválida");
			System.out.println();
			System.out.println("Digite uma nota entre 0 a 10:");
			nota = input.nextInt();
		}
		System.out.println("Fim da execução...");
		input.close();

	}

}

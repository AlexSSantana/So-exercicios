package repeticao;

import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		/*
		 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer n�mero
		 * inteiro entre 1 a 10. O usu�rio deve informar de qual numero ele deseja ver a
		 * tabuada. A sa�da deve ser conforme o exemplo abaixo: Tabuada de 5: 5 X 1 = 5
		 * 5 X 2 = 10 ... 5 X 10 = 50
		 */

		Scanner input = new Scanner(System.in);

		int n;

		System.out.println("==========Gerador de tabuada==========");
		System.out.println();
		System.out.println("Digite um n�mero inteiro:");
		n = input.nextInt();

		for (int i = 1; i <= 10; i++) {
			int produto = n * i;
			System.out.println(n + " X " + i + " = " + produto);
		}
		input.close();
	}

}

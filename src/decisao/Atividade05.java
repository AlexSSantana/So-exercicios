package decisao;

import java.util.Locale;
import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa para a leitura de duas notas parciais de um aluno. O
		 * programa deve calcular a m�dia alcan�ada por aluno e apresentar: A mensagem
		 * "Aprovado", se a m�dia alcan�ada for maior ou igual a sete; A mensagem
		 * "Reprovado", se a m�dia for menor do que sete; A mensagem
		 * "Aprovado com Distin��o", se a m�dia for igual a dez.
		 */

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		double nota1 = input.nextDouble();

		System.out.print("Digite a segunda nota: ");
		double nota2 = input.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media >= 7.0) {
			System.out.println(media + " de m�dia");
			System.out.println("Aprovado");
		} else if (media < 7.0) {
			System.out.println(media + " de m�dia");
			System.out.println("Reprovado");
		} else if (media == 10.0) {
			System.out.println(media + " de m�dia");
			System.out.println("Aprovado com distin��o");
		}
		input.close();
	}

}

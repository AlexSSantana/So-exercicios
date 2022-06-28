package decisao;

import java.util.Scanner;

public class Atividade18 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa para leitura de três notas parciais de um aluno. O programa
		 * deve calcular a média alcançada por aluno e presentar: A mensagem "Aprovado",
		 * se a média for maior ou igual a 7, com a respectiva média alcançada; A
		 * mensagem "Reprovado", se a média for menor do que 7, com a respectiva média
		 * alcançada; A mensagem "Aprovado com Distinção", se a média for igual a 10.a
		 */
		Scanner input = new Scanner(System.in);

		double media;

		System.out.println("Entre com três notas");
		double nota1 = input.nextDouble();
		double nota2 = input.nextDouble();
		double nota3 = input.nextDouble();

		media = (nota1 + nota2 + nota3) / 3.0;

		if (media >= 7) {
			System.out.printf("Aprovado com média: %.1f\n", media);
		} else if (media < 7) {
			System.out.printf("Reprovado com média: %.1f\n", media);
		} else if (media == 10) {
			System.out.printf("Aprovado com distinção, média: %.1f\n", media);
		} else {
			System.out.println("Média inválida");
		}
		input.close();

	}

}

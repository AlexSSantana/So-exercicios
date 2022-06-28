package decisao;

import java.util.Scanner;

public class Atividade18 {

	public static void main(String[] args) {
		/*
		 * Fa�a um Programa para leitura de tr�s notas parciais de um aluno. O programa
		 * deve calcular a m�dia alcan�ada por aluno e presentar: A mensagem "Aprovado",
		 * se a m�dia for maior ou igual a 7, com a respectiva m�dia alcan�ada; A
		 * mensagem "Reprovado", se a m�dia for menor do que 7, com a respectiva m�dia
		 * alcan�ada; A mensagem "Aprovado com Distin��o", se a m�dia for igual a 10.a
		 */
		Scanner input = new Scanner(System.in);

		double media;

		System.out.println("Entre com tr�s notas");
		double nota1 = input.nextDouble();
		double nota2 = input.nextDouble();
		double nota3 = input.nextDouble();

		media = (nota1 + nota2 + nota3) / 3.0;

		if (media >= 7) {
			System.out.printf("Aprovado com m�dia: %.1f\n", media);
		} else if (media < 7) {
			System.out.printf("Reprovado com m�dia: %.1f\n", media);
		} else if (media == 10) {
			System.out.printf("Aprovado com distin��o, m�dia: %.1f\n", media);
		} else {
			System.out.println("M�dia inv�lida");
		}
		input.close();

	}

}

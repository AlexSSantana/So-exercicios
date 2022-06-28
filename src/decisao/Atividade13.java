package decisao;

import java.util.Scanner;

public class Atividade13 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que leia um número e exiba o dia correspondente da semana.
		 * (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor
		 * inválido.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um número:");
		int n = input.nextInt();

		if (n == 1) {
			System.out.println("1-Domingo");
		} else if (n == 2) {
			System.out.println("2-Segunda");
		} else if (n == 3) {
			System.out.println("3-Terça");
		} else if (n == 4) {
			System.out.println("4-Quarta");
		} else if (n == 5) {
			System.out.println("5-Quinta");
		} else if (n == 6) {
			System.out.println("6-Sexta");
		} else if (n == 7) {
			System.out.println("7-Sábado");
		} else {
			System.out.println("Valor inválido");
		}
		input.close();
	}

}

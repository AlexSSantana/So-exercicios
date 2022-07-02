package decisao;

import java.util.Scanner;

public class Atividade19 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As
		 * perguntas são: "Telefonou para a vítima?" "Esteve no local do crime?"
		 * "Mora perto da vítima?" "Devia para a vítima?" "Já trabalhou com a vítima?" O
		 * programa deve no final emitir uma classificação sobre a participação da
		 * pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve
		 * ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
		 * "Assassino". Caso contrário, ele será classificado como "Inocente".
		 */
		Scanner input = new Scanner(System.in);

		char resp1 = 0;
		char resp2 = 0;
		char resp3 = 0;
		char resp4 = 0;
		char resp5 = 0;
		int countYes = 0;
		int countNo = 0;
		System.out.println("Responda S (Sim) ou N (Não)");
		System.out.println("Telefonou para a vítima?");
		resp1 = input.next().charAt(0);
		System.out.println("Esteve no local do crime?");
		resp2 = input.next().charAt(0);
		System.out.println("Mora perto da vítima?");
		resp3 = input.next().charAt(0);
		System.out.println("Devia para a vítma?");
		resp4 = input.next().charAt(0);
		System.out.println("Já trabalhou com a vítima?");
		resp5 = input.next().charAt(0);

		if (resp1 == 's' || resp1 == 'S') {
			countYes = countYes + 1;
		} else {
			countNo = countNo + 1;
		}

		if (resp2 == 's' || resp2 == 'S') {
			countYes = countYes + 1;
		} else {
			countNo = countNo + 1;
		}

		if (resp3 == 's' || resp3 == 'S') {
			countYes = countYes + 1;
		} else {
			countNo = countNo + 1;
		}

		if (resp4 == 's' || resp4 == 'S') {
			countYes = countYes + 1;
		} else {
			countNo = countNo + 1;
		}

		if (resp5 == 's' || resp5 == 'S') {
			countYes = countYes + 1;
		} else {
			countNo = countNo + 1;
		}

		if (countYes == 2) {
			System.out.println("Suspeita");
		} else if (countYes >= 3 && countYes <= 4) {
			System.out.println("Cúmplice");
		} else if (countYes == 5) {
			System.out.println("Assassino");
		} else {
			System.out.println("Inocente");
		}
		input.close();
	}

}

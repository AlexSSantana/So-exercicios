package decisao;

import java.util.Scanner;

public class Atividade21 {

	public static void main(String[] args) {
		/*
		 * 
		 */

		Scanner input = new Scanner(System.in);

		int kgMorango;
		int kgMa�a;
		double pre�oMa�a;
		double pre�oMorango;
		double totalPagarMa�a;
		double totalPagarMorango;
		double totalDesconto = 0;
		double totalDesconto2 = 0;

		System.out.println("Digite quantos Kg de ma�� deseja comprar:");
		kgMa�a = input.nextInt();

		if (kgMa�a > 0 && kgMa�a <= 5) {
			pre�oMa�a = 1.80;
			totalPagarMa�a = kgMa�a * pre�oMa�a;
			System.out.println("Total de Kg de Ma��: " + kgMa�a);
			System.out.printf("Total a pagar: R$ %.2f\n", totalPagarMa�a);
		} else if (kgMa�a > 5) {
			pre�oMa�a = 1.50;
			totalPagarMa�a = kgMa�a * pre�oMa�a;
			System.out.println("Total de Kg de Ma��: " + kgMa�a);
			System.out.printf("Total a pagar: R$ %.2f\n", totalPagarMa�a);
		} else if (kgMa�a > 8) {
			pre�oMa�a = 1.50;
			totalPagarMa�a = kgMa�a * pre�oMa�a;
			totalDesconto = totalPagarMa�a * ((double) 10 / 100);
			System.out.printf("Total a pagar com desconto de 10%%: %.2f\n", totalPagarMa�a - totalDesconto);
		}

		System.out.println("Digite quantos Kg de morango deseja comprar:");
		kgMorango = input.nextInt();

		if (kgMorango > 0 && kgMorango <= 5) {
			pre�oMorango = 2.50;
			totalPagarMorango = kgMorango * pre�oMorango;
			System.out.println("Total de Kg de Ma��: " + kgMorango);
			System.out.printf("Total a pagar: R$ %.2f\n", totalPagarMorango);
		} else if (kgMorango > 5) {
			pre�oMorango = 2.20;
			totalPagarMorango = kgMorango * pre�oMorango;
			System.out.println("Total de Kg de Ma��: " + kgMorango);
			System.out.printf("Total a pagar: R$ %.2f\n", totalPagarMorango);
		} else if (kgMorango > 8) {
			pre�oMorango = 1.50;
			totalPagarMorango = kgMorango * pre�oMorango;
			totalDesconto2 = totalPagarMorango * ((double) 10 / 100);
			System.out.printf("Total a pagar com desconto de 10%%: %.2f\n", totalPagarMorango - totalDesconto2);

		}
		input.close();
	}
}
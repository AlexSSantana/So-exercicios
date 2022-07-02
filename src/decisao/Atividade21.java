package decisao;

import java.util.Scanner;

public class Atividade21 {

	public static void main(String[] args) {
		/*
		 * 
		 */

		Scanner input = new Scanner(System.in);

		int kgMorango;
		int kgMaça;
		double preçoMaça;
		double preçoMorango;
		double totalPagarMaça;
		double totalPagarMorango;
		double totalDesconto = 0;
		double totalDesconto2 = 0;

		System.out.println("Digite quantos Kg de maçã deseja comprar:");
		kgMaça = input.nextInt();

		if (kgMaça > 0 && kgMaça <= 5) {
			preçoMaça = 1.80;
			totalPagarMaça = kgMaça * preçoMaça;
			System.out.println("Total de Kg de Maçã: " + kgMaça);
			System.out.printf("Total a pagar: R$ %.2f\n", totalPagarMaça);
		} else if (kgMaça > 5) {
			preçoMaça = 1.50;
			totalPagarMaça = kgMaça * preçoMaça;
			System.out.println("Total de Kg de Maçã: " + kgMaça);
			System.out.printf("Total a pagar: R$ %.2f\n", totalPagarMaça);
		} else if (kgMaça > 8) {
			preçoMaça = 1.50;
			totalPagarMaça = kgMaça * preçoMaça;
			totalDesconto = totalPagarMaça * ((double) 10 / 100);
			System.out.printf("Total a pagar com desconto de 10%%: %.2f\n", totalPagarMaça - totalDesconto);
		}

		System.out.println("Digite quantos Kg de morango deseja comprar:");
		kgMorango = input.nextInt();

		if (kgMorango > 0 && kgMorango <= 5) {
			preçoMorango = 2.50;
			totalPagarMorango = kgMorango * preçoMorango;
			System.out.println("Total de Kg de Maçã: " + kgMorango);
			System.out.printf("Total a pagar: R$ %.2f\n", totalPagarMorango);
		} else if (kgMorango > 5) {
			preçoMorango = 2.20;
			totalPagarMorango = kgMorango * preçoMorango;
			System.out.println("Total de Kg de Maçã: " + kgMorango);
			System.out.printf("Total a pagar: R$ %.2f\n", totalPagarMorango);
		} else if (kgMorango > 8) {
			preçoMorango = 1.50;
			totalPagarMorango = kgMorango * preçoMorango;
			totalDesconto2 = totalPagarMorango * ((double) 10 / 100);
			System.out.printf("Total a pagar com desconto de 10%%: %.2f\n", totalPagarMorango - totalDesconto2);

		}
		input.close();
	}
}
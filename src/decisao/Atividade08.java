package decisao;

import java.util.Locale;
import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que pergunte o preço de três produtos e informe qual produto
		 * você deve comprar, sabendo que a decisão é sempre pelo mais barato.
		 */

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Qual o valor do azeite?");
		double product1 = input.nextDouble();
		System.out.println("Qual o valor do óleo de girassol?");
		double product2 = input.nextDouble();
		System.out.println("Qual o valor do óleo de soja?");
		double product3 = input.nextDouble();

		if (product1 < product2 && product1 < product3) {
			System.out.println(" O azeite é o mais barato");
		} else if (product2 < product1 && product2 < product3) {
			System.out.println("O óleo de girassol é o mais barato");
		} else {
			System.out.println("O óleo de soja é o mais barato");
		}

		input.close();

	}

}

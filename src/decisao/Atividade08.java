package decisao;

import java.util.Locale;
import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual produto
		 * voc� deve comprar, sabendo que a decis�o � sempre pelo mais barato.
		 */

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Qual o valor do azeite?");
		double product1 = input.nextDouble();
		System.out.println("Qual o valor do �leo de girassol?");
		double product2 = input.nextDouble();
		System.out.println("Qual o valor do �leo de soja?");
		double product3 = input.nextDouble();

		if (product1 < product2 && product1 < product3) {
			System.out.println(" O azeite � o mais barato");
		} else if (product2 < product1 && product2 < product3) {
			System.out.println("O �leo de girassol � o mais barato");
		} else {
			System.out.println("O �leo de soja � o mais barato");
		}

		input.close();

	}

}

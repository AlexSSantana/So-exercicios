package decisao;

import java.util.Scanner;

public class Atividade20 {

	public static void main(String[] args) {
		/*
		 * Um posto est� vendendo combust�veis com a seguinte tabela de descontos:
		 * �lcool: at� 20 litros, desconto de 3% por litro acima de 20 litros, desconto
		 * de 5% por litro Gasolina: at� 20 litros, desconto de 4% por litro acima de 20
		 * litros, desconto de 6% por litro Escreva um algoritmo que leia o n�mero de
		 * litros vendidos, o tipo de combust�vel (codificado da seguinte forma:
		 * A-�lcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente
		 * sabendo-se que o pre�o do litro da gasolina � R$ 2,50 o pre�o do litro do
		 * �lcool � R$ 1,90.
		 */

		Scanner input = new Scanner(System.in);

		double priceGasoline = 2.50;
		double priceAlcohol = 1.90;
		int litrosVendidos;
		double descontoGasoline;
		double descontoAlcohol;
		char nameCombustivel;

		System.out.println("Digite [ G ] - Gasolina ou [ A ] - �lcool?");
		nameCombustivel = input.next().charAt(0);

		if (nameCombustivel == 'g' || nameCombustivel == 'G') {
			System.out.println("Digite quantos litros foram vendidos:");
			litrosVendidos = input.nextInt();
			if (litrosVendidos > 1 && litrosVendidos <= 20) {
				double totalPrice = litrosVendidos * priceGasoline;
				double conversao = totalPrice * ((double) 4 / 100);
				descontoGasoline = totalPrice - conversao;
				System.out.printf("O valor a pagar com desconto � de: R$ %.2f\n", descontoGasoline);
			} else if (litrosVendidos > 20) {
				double totalPrice = litrosVendidos * priceGasoline;
				double conversao = totalPrice * ((double) 6 / 100);
				descontoGasoline = totalPrice - conversao;
				System.out.printf("O valor a pagar com desconto � de: R$ %.2f\n", descontoGasoline);
			}
		}
		if (nameCombustivel == 'a' || nameCombustivel == 'A') {
			System.out.println("Digite quantos litros foram vendidos:");
			litrosVendidos = input.nextInt();
			if (litrosVendidos > 1 && litrosVendidos <= 20) {
				double totalPrice = litrosVendidos * priceAlcohol;
				double conversao = totalPrice * ((double) 3 / 100);
				descontoAlcohol = totalPrice - conversao;
				System.out.printf("O valor a pagar com desconto � de: R$ %.2f\n", descontoAlcohol);
			} else if (litrosVendidos > 20) {
				double totalPrice = litrosVendidos * priceAlcohol;
				double conversao = totalPrice * ((double) 5 / 100);
				descontoAlcohol = totalPrice - conversao;
				System.out.printf("O valor a pagar com desconto � de: R$ %.2f\n", descontoAlcohol);
			}
		}
		input.close();
	}

}

package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {
		/*
		 * João Papo-de-Pescador, homem de bem, comprou um microcomputador para
		 * controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso
		 * de peixes maior que o estabelecido pelo regulamento de pesca do estado de São
		 * Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João
		 * precisa que você faça um programa que leia a variável peso (peso de peixes) e
		 * calcule o excesso. Gravar na variável excesso a quantidade de quilos além do
		 * limite e na variável multa o valor da multa que João deverá pagar. Imprima os
		 * dados do programa com as mensagens adequadas.
		 * 
		 */

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		double kg;
		double multa = 4.00;
		double limite = 50;
		double excesso;

		System.out.println("Quantos Kg de peixes foi pescado no dia?");
		kg = input.nextDouble();
		System.out.printf("O peso digitado foi de: %.1f Kg \n", kg);

		if (kg > limite) {
			excesso = kg - limite;
			System.out.printf("O excesso foi de: %.1f Kg \n", excesso);
			excesso = excesso * multa;
			System.out.printf("O valor a pagar pelo excesso é de: R$ %.2f\n", excesso);
		} else {
			System.out.println("Insento da taxa.");
		}

		input.close();

	}

}

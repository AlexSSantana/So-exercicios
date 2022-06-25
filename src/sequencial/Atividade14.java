package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {
		/*
		 * Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para
		 * controlar o rendimento di�rio de seu trabalho. Toda vez que ele traz um peso
		 * de peixes maior que o estabelecido pelo regulamento de pesca do estado de S�o
		 * Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. Jo�o
		 * precisa que voc� fa�a um programa que leia a vari�vel peso (peso de peixes) e
		 * calcule o excesso. Gravar na vari�vel excesso a quantidade de quilos al�m do
		 * limite e na vari�vel multa o valor da multa que Jo�o dever� pagar. Imprima os
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
			System.out.printf("O valor a pagar pelo excesso � de: R$ %.2f\n", excesso);
		} else {
			System.out.println("Insento da taxa.");
		}

		input.close();

	}

}

package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		/*
		 * Fa�a um Programa que pe�a a temperatura em graus Celsius, transforme e mostre
		 * em graus Fahrenheit.
		 */
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("====Programa de conver��o de Celsius em Fahrenheit====");
		System.out.println();

		System.out.println("Digite a temperatura em graus Celsius:");
		double celsius = input.nextDouble();

		double f = celsius * 1.8 + 32;

		System.out.printf("O resultado da conver��o �: %.1f �F", f);

		input.close();

	}

}

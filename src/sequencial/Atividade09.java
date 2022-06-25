package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Atividade09 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e
		 * mostre a temperatura em graus Celsius. C = 5 * ((F-32) / 9).
		 */
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Digite a temperatura em graus Fahrenheit");
		double fahrenheit = input.nextDouble();

		double celsius = 5 * ((fahrenheit - 32) / 9);

		System.out.printf("O resultado da converção é: %.1f °C", celsius);

		input.close();
	}

}

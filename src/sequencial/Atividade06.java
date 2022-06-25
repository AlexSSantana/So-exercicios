package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que pe�a o valor de um raio calcule e mostre a area de um
		 * circulo.
		 */

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double raio;
		double area;
		double pi = 3.141592;

		System.out.print("Digite um valor para o raio: ");
		raio = input.nextDouble();

		area = pi * (Math.pow(raio, 2));

		System.out.printf("A area de um circulo de raio %.1f � igual a: %.1f\n", raio, area);

		input.close();

	}

}

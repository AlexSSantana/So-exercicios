package decisao;

import java.util.Locale;
import java.util.Scanner;

public class Atividade15 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que peça os 3 lados de um triângulo. O programa deverá
		 * informar se os valores podem ser um triângulo. Indique, caso os lados formem
		 * um triângulo, se o mesmo é: equilátero, isósceles ou escaleno. Dicas: Três
		 * lados formam um triângulo quando a soma de quaisquer dois lados for maior que
		 * o terceiro; Triângulo Equilátero: três lados iguais; Triângulo Isósceles:
		 * quaisquer dois lados iguais; Triângulo Escaleno: três lados diferentes;
		 */

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Digite três lados de um triângulo:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("É possivel formar um triangulo.");
			if (a == b && a == c) {
				System.out.println("Triângulo Equilátero.");
			} else if (a == b || b == c) {
				System.out.println("Triângulo Isósceles.");
			} else if (a != b && b != c) {
				System.out.println("Triângulo Escaleno.");
			}
		} else {
			System.out.println("Não forma um Triângulo.");
		}

		input.close();
	}

}

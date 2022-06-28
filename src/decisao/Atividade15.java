package decisao;

import java.util.Locale;
import java.util.Scanner;

public class Atividade15 {

	public static void main(String[] args) {
		/*
		 * Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. O programa dever�
		 * informar se os valores podem ser um tri�ngulo. Indique, caso os lados formem
		 * um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou escaleno. Dicas: Tr�s
		 * lados formam um tri�ngulo quando a soma de quaisquer dois lados for maior que
		 * o terceiro; Tri�ngulo Equil�tero: tr�s lados iguais; Tri�ngulo Is�sceles:
		 * quaisquer dois lados iguais; Tri�ngulo Escaleno: tr�s lados diferentes;
		 */

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Digite tr�s lados de um tri�ngulo:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("� possivel formar um triangulo.");
			if (a == b && a == c) {
				System.out.println("Tri�ngulo Equil�tero.");
			} else if (a == b || b == c) {
				System.out.println("Tri�ngulo Is�sceles.");
			} else if (a != b && b != c) {
				System.out.println("Tri�ngulo Escaleno.");
			}
		} else {
			System.out.println("N�o forma um Tri�ngulo.");
		}

		input.close();
	}

}

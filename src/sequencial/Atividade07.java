package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		/*
		 * Fa�a um Programa que calcule a �rea de um quadrado, em seguida mostre o dobro
		 * desta �rea para o usu�rio.
		 */
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double area;
		double base;
		double altura;

		System.out.println("Informe o valor da base");
		base = input.nextDouble();
		System.out.println("Informe o valor da altura");
		altura = input.nextDouble();

		area = base * altura;
		System.out.printf("A area do quadrado �: %.1f\n",area);
		area = area * 2;

		System.out.printf("O dobro da area �: %.1f\n", area);

		input.close();
	}

}

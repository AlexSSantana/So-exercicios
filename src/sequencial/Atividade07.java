package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro
		 * desta área para o usuário.
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
		System.out.printf("A area do quadrado é: %.1f\n",area);
		area = area * 2;

		System.out.printf("O dobro da area é: %.1f\n", area);

		input.close();
	}

}

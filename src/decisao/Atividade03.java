package decisao;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		/*
		 * Fa�a um Programa que verifique se uma letra digitada � "F" ou "M". Conforme a
		 * letra escrever: F - Feminino, M - Masculino, Sexo Inv�lido.
		 */

		Scanner input = new Scanner(System.in);

		char letra;

		System.out.println("Digite F ou M:");
		letra = input.next().charAt(0);

		if (letra == 'F' || letra == 'f') {
			System.out.println("F - Feminino");
		} else if (letra == 'm' || letra == 'M') {
			System.out.println("M - Maculino");
		} else {
			System.out.println("Sexo inv�lido");
		}

		input.close();

	}

}

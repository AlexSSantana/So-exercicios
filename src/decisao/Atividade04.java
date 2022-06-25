package decisao;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
		 */

		Scanner input = new Scanner(System.in);

		System.out.print("Digite qualquer letra: ");
		char letra = input.next().charAt(0);

		if (letra == 'a' || letra == 'A') {
			System.out.println("Vogal");
		} else if (letra == 'e' || letra == 'E') {
			System.out.println("Vogal");
		} else if (letra == 'i' || letra == 'I') {
			System.out.println("Vogal");
		} else if (letra == 'o' || letra == 'O') {
			System.out.println("Vogal");
		} else if (letra == 'u' || letra == 'U') {
			System.out.println("Vogal");
		} else {
			System.out.println("Consoante");
		}
		input.close();
	}

}

package repeticao;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		/*
		 * Exercicio de repetição, urna eletronica simples.
		 */

		Scanner input = new Scanner(System.in);

		int resp1;
		int resp2;
		int candidato1 = 0;
		int candidato2 = 0;

		System.out.println("=====Urna eletronica=====");

		System.out.println("Digite 3 para votar ou 7 para finalizar a votação.");
		resp1 = input.nextInt();

		while (resp1 != 7) {
			System.out.println("Digite 1 para votar em Rodolfo ou 2 para votar em Jose.");
			resp2 = input.nextInt();
			if (resp2 == 1) {
				candidato1 = candidato1 + 1;
			} else if (resp2 == 2) {
				candidato2 = candidato2 + 1;
			}
			System.out.println("Digite 3 para votar ou 7 para finalizar a votação.");
			resp1 = input.nextInt();
		}
		if (candidato2 > candidato1) {
			System.out.println("Jose é o vencedor com: " + candidato2 + " votos.");
		} else if (candidato1 > candidato2) {
			System.out.println("Rodolfo é o vencedor com " + candidato1 + " votos.");
		} else if (candidato1 == 0 && candidato2 == 0) {
			System.out.println("Será realizada nova eleição");
		} else if(candidato1 == candidato2) {
			System.out.println("Empate técnico");
		}

		input.close();

	}

}

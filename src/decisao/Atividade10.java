package decisao;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que pergunte em que turno você estuda. Peça para digitar
		 * M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!",
		 * "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
		 * 
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("====Qual turno vc estuda?====");
		System.out.println("Digite [ M ] para Matutino,[ V ] para  Vespertino ou [ N ] para Noturno");
		char letra = input.next().charAt(0);

		if (letra == 'm' || letra == 'M') {
			System.out.println("Bom dia");
		} else if (letra == 'v' || letra == 'V') {
			System.out.println("Boa tarde");
		} else if (letra == 'n' || letra == 'N') {
			System.out.println("Boa noite");
		} else {
			System.out.println("Comando inválido");
		}
		input.close();
	}

}

package decisao;

import java.util.Scanner;

public class Atividade16 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a
		 * mesma é uma data válida.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma data no formato dd/mm/aaaa");
		int dia = input.nextInt();
		int mes = input.nextInt();
		int ano = input.nextInt();
		
		if(dia < 1 || dia > 31) {
			System.out.println("Data inválida");
		} if(mes < 1 || mes > 12) {
			System.out.println("Data inválida");
		} if(ano < 1) {
			System.out.println("Data inálida");
		}
		input.close();
	}

}

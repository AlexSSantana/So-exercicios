package decisao;

import java.util.Scanner;

public class Atividade16 {

	public static void main(String[] args) {
		/*
		 * Fa�a um Programa que pe�a uma data no formato dd/mm/aaaa e determine se a
		 * mesma � uma data v�lida.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma data no formato dd/mm/aaaa");
		int dia = input.nextInt();
		int mes = input.nextInt();
		int ano = input.nextInt();
		
		if(dia < 1 || dia > 31) {
			System.out.println("Data inv�lida");
		} if(mes < 1 || mes > 12) {
			System.out.println("Data inv�lida");
		} if(ano < 1) {
			System.out.println("Data in�lida");
		}
		input.close();
	}

}

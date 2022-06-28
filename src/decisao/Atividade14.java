package decisao;

import java.util.Locale;
import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que lê as duas notas parciais obtidas por um aluno numa
		 * disciplina ao longo de um semestre, e calcule a sua média. A atribuição de
		 * conceitos obedece à tabela abaixo:
		 */

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double nota1;
		double nota2;
		double media;

		System.out.println("Digite a primeira nota:");
		nota1 = input.nextDouble();

		System.out.println("Digite a segunta nota:");
		nota2 = input.nextDouble();

		media = (nota1 + nota2) / 2.0;

		if (media > 0 && media <= 4.0) {
			System.out.println("Primeira nota: "+ nota1);
			System.out.println("Segunda nota: "+ nota2);
			System.out.println("A média é: "+ media);
			System.out.println("Conceito E");
			System.out.println("REPROVADO");
		} else if (media > 4.0 && media <= 6.0) {
			System.out.println("Primeira nota: " + nota1);
			System.out.println("Segunda nota: " + nota2);
			System.out.println("A média é: " + media);
			System.out.println("Conceito D");
			System.out.println("REPROVADO");
		} else if (media > 6.0 && media <= 7.5) {
			System.out.println("Primeira nota: " + nota1);
			System.out.println("Segunda nota: " + nota2);
			System.out.println("A média é: " + media);
			System.out.println("Conceito C");
			System.out.println("APROVADO");
		} else if (media > 7.5 && media <= 9.0) {
			System.out.println("Primeira nota: "+ nota1);
			System.out.println("Segunda nota: "+ nota2);
			System.out.println("A média é: "+ media);
			System.out.println("Conceito B");
			System.out.println("APROVADO");
		} else if (media > 9.0 && media <= 10.0) {
			System.out.println("Primeira nota: "+ nota1);
			System.out.println("Segunda nota: "+ nota2);
			System.out.println("A média é: "+ media);
			System.out.println("Conceito A");
			System.out.println("APROVADO");
		} else {
			System.out.println("Notas inválidas");
		}

		input.close();

	}

}

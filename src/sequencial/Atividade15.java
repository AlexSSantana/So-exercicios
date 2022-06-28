package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Atividade15 {

	public static void main(String[] args) {
		/*
		 * Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas
		 * trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s,
		 * sabendo-se que s�o descontados 11% para o Imposto de Renda, 8% para o INSS e
		 * 5% para o sindicato, fa�a um programa que nos d�: sal�rio bruto. quanto pagou
		 * ao INSS. quanto pagou ao sindicato. o sal�rio l�quido. calcule os descontos e
		 * o sal�rio l�quido, conforme a tabela abaixo: + Sal�rio Bruto : R$ - IR (11%)
		 * : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$ = Sal�rio Liquido : R$
		 */

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.print("Quanto voc� ganha por hora? ");
		double horaTrabalho = input.nextDouble();

		System.out.print("Quantas horas voc� trabalhou esse m�s? ");
		int horaTrabalhada = input.nextInt();
		
		

		double salarioBruto = horaTrabalho * horaTrabalhada;
		
		System.out.printf("Salario bruto : R$ %.2f\n", salarioBruto);
		
		double desconto1 = salarioBruto * 0.11;
		double desconto2 = salarioBruto * 0.08;
		double desconto3 = salarioBruto * 0.05;
		double salarioLiquido = salarioBruto - desconto1 - desconto2 - desconto3;

		System.out.printf("IR (11 porcento) : R$ %.2f\n", desconto1);
		System.out.printf("INSS (8 porcento) : R$ %.2f\n", desconto2);
		System.out.printf("Sindicato (5 porcento) : R$ %.2f\n", desconto3);
		System.out.printf("Sal�rio l�quido : R$ %.2f\n", salarioLiquido);
		
		
		input.close();

	}

}

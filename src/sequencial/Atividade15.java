package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Atividade15 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas
		 * trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês,
		 * sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e
		 * 5% para o sindicato, faça um programa que nos dê: salário bruto. quanto pagou
		 * ao INSS. quanto pagou ao sindicato. o salário líquido. calcule os descontos e
		 * o salário líquido, conforme a tabela abaixo: + Salário Bruto : R$ - IR (11%)
		 * : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$ = Salário Liquido : R$
		 */

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.print("Quanto você ganha por hora? ");
		double horaTrabalho = input.nextDouble();

		System.out.print("Quantas horas você trabalhou esse mês? ");
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
		System.out.printf("Salário líquido : R$ %.2f\n", salarioLiquido);
		
		
		input.close();

	}

}

package decisao;

import java.util.Locale;
import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para o cálculo de uma folha de pagamento, sabendo que os
		 * descontos são do Imposto de Renda, que depende do salário bruto (conforme
		 * tabela abaixo) o FGTS corresponde a 11% do Salário Bruto, mas não é
		 * descontado (é a empresa que deposita). O Salário Líquido corresponde ao
		 * Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor
		 * da sua hora e a quantidade de horas trabalhadas no mês. Desconto do IR:
		 * Salário Bruto até 900 (inclusive) - isento Salário Bruto até 1500 (inclusive)
		 * - desconto de 5% Salário Bruto até 2500 (inclusive) - desconto de 10% Salário
		 * Bruto acima de 2500 - desconto de 20% Imprima na tela as informações,
		 * dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a
		 * quantidade de hora é 220.
		 */

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double ir;
		double inss;
		double fgts;
		double totalDescontos;
		double salarioLiquido;

		System.out.println("Qual o valor da sua hora de trabalho?");
		double valorHora = input.nextDouble();

		System.out.println("Quantas horas você trabalhou no mês?");
		int horaTrabalhada = input.nextInt();

		double salarioBruto = valorHora * horaTrabalhada;

		System.out.printf("Salário bruto: %d * %.2f = R$ %.2f\n", horaTrabalhada, valorHora, salarioBruto);

		if (salarioBruto <= 900.00) {
			System.out.println("Isento");
		} else if (salarioBruto > 900.00 && salarioBruto <= 1500.00) {
			ir = salarioBruto * ((double) 5 / 100);
			inss = salarioBruto * ((double) 10 / 100);
			fgts = salarioBruto * ((double) 11 / 100);
			totalDescontos = ir + inss;
			salarioLiquido = salarioBruto - ir - inss;
			System.out.printf("(-) IR (5%%) : R$ %.2f\n", ir);
			System.out.printf("(-) INSS (10%%) : R$ %.2f\n", inss);
			System.out.printf("FGTS (11%%) : R$ %.2f\n", fgts);
			System.out.printf("Total de descontos : R$ %.2f\n", totalDescontos);
			System.out.printf("Salário Liquido : R$ %.2f\n", salarioLiquido);
		} else if (salarioBruto > 1500.00 && salarioBruto <= 2500.00) {
			ir = salarioBruto * ((double) 10 / 100);
			inss = salarioBruto * ((double) 10 / 100);
			fgts = salarioBruto * ((double) 11 / 100);
			totalDescontos = ir + inss;
			salarioLiquido = salarioBruto - ir - inss;
			System.out.printf("(-) IR (10%%) : R$ %.2f\n", ir);
			System.out.printf("(-) INSS (10%%) : R$ %.2f\n", inss);
			System.out.printf("FGTS (11%%) : R$ %.2f\n", fgts);
			System.out.printf("Total de descontos : R$ %.2f\n", totalDescontos);
			System.out.printf("Salário Liquido : R$ %.2f\n", salarioLiquido);
		} else if (salarioBruto > 2500.00) {
			ir = salarioBruto * ((double) 20 / 100);
			inss = salarioBruto * ((double) 10 / 100);
			fgts = salarioBruto * ((double) 11 / 100);
			totalDescontos = ir + inss;
			salarioLiquido = salarioBruto - ir - inss;
			System.out.printf("(-) IR (20%%) : R$ %.2f\n", ir);
			System.out.printf("(-) INSS (10%%) : R$ %.2f\n", inss);
			System.out.printf("FGTS (11%%) : R$ %.2f\n", fgts);
			System.out.printf("Total de descontos : R$ %.2f\n", totalDescontos);
			System.out.printf("Salário Liquido : R$ %.2f\n", salarioLiquido);
		}

		input.close();
	}

}

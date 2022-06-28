package decisao;

import java.util.Locale;
import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa para o c�lculo de uma folha de pagamento, sabendo que os
		 * descontos s�o do Imposto de Renda, que depende do sal�rio bruto (conforme
		 * tabela abaixo) o FGTS corresponde a 11% do Sal�rio Bruto, mas n�o �
		 * descontado (� a empresa que deposita). O Sal�rio L�quido corresponde ao
		 * Sal�rio Bruto menos os descontos. O programa dever� pedir ao usu�rio o valor
		 * da sua hora e a quantidade de horas trabalhadas no m�s. Desconto do IR:
		 * Sal�rio Bruto at� 900 (inclusive) - isento Sal�rio Bruto at� 1500 (inclusive)
		 * - desconto de 5% Sal�rio Bruto at� 2500 (inclusive) - desconto de 10% Sal�rio
		 * Bruto acima de 2500 - desconto de 20% Imprima na tela as informa��es,
		 * dispostas conforme o exemplo abaixo. No exemplo o valor da hora � 5 e a
		 * quantidade de hora � 220.
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

		System.out.println("Quantas horas voc� trabalhou no m�s?");
		int horaTrabalhada = input.nextInt();

		double salarioBruto = valorHora * horaTrabalhada;

		System.out.printf("Sal�rio bruto: %d * %.2f = R$ %.2f\n", horaTrabalhada, valorHora, salarioBruto);

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
			System.out.printf("Sal�rio Liquido : R$ %.2f\n", salarioLiquido);
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
			System.out.printf("Sal�rio Liquido : R$ %.2f\n", salarioLiquido);
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
			System.out.printf("Sal�rio Liquido : R$ %.2f\n", salarioLiquido);
		}

		input.close();
	}

}

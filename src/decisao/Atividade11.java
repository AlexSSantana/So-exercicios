package decisao;

import java.util.Locale;
import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		/*
		 * As Organizações Tabajara resolveram dar um aumento de salário aos seus
		 * colaboradores e lhe contraram para desenvolver o programa que calculará os
		 * reajustes. Faça um programa que recebe o salário de um colaborador e o
		 * reajuste segundo o seguinte critério, baseado no salário atual: salários até
		 * R$ 280,00 (incluindo) : aumento de 20% salários entre R$ 280,00 e R$ 700,00 :
		 * aumento de 15% salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
		 * salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser
		 * realizado, informe na tela: o salário antes do reajuste; o percentual de
		 * aumento aplicado; o valor do aumento; o novo salário, após o aumento.
		 */

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double ajuste1;
		double ajuste2;
		double ajuste3;
		double ajuste4;
		double newSalary;

		System.out.print("Digite o salário do colaborador R$ ");
		double salario = input.nextDouble();

		if (salario <= 280.00) {
			ajuste1 = salario * ((double) 20 / 100);
			newSalary = salario + ajuste1;
			System.out.printf("O salário antes do reajuste é de: R$ %.2f\n", salario);
			System.out.println("O percentual de aumento aplicado é de 20%");
			System.out.printf("O valor do aumento é de: R$ %.2f\n", ajuste1);
			System.out.printf("O novo salário é de: R$ %.2f\n", newSalary);
		} else if (salario > 280.00 && salario <= 700.00) {
			ajuste2 = salario * ((double) 15 / 100);
			newSalary = salario + ajuste2;
			System.out.printf("O salário antes do reajuste é de: R$ %.2f\n", salario);
			System.out.println("O percentual de aumento aplicado é de 15%");
			System.out.printf("O valor do aumento é de: R$ %.2f\n", ajuste2);
			System.out.printf("O novo salário é de: R$ %.2f\n", newSalary);
		} else if (salario > 700.00 && salario <= 1500.00) {
			ajuste3 = salario * ((double) 10 / 100);
			newSalary = salario + ajuste3;
			System.out.printf("O salário antes do reajuste é de: R$ %.2f\n", salario);
			System.out.println("O percentual de aumento aplicado é de 10%");
			System.out.printf("O valor do aumento é de: R$ %.2f\n", ajuste3);
			System.out.printf("O novo salário é de: R$ %.2f\n", newSalary);
		} else if (salario > 1500.00) {
			ajuste4 = salario * ((double) 5 / 100);
			newSalary = salario + ajuste4;
			System.out.printf("O salário antes do reajuste é de: R$ %.2f\n", salario);
			System.out.println("O percentual de aumento aplicado é de 5%");
			System.out.printf("O valor do aumento é de: R$ %.2f\n", ajuste4);
			System.out.printf("O novo salário é de: R$ %.2f\n", newSalary);
		}
		input.close();

	}

}

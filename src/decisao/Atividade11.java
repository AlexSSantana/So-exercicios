package decisao;

import java.util.Locale;
import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		/*
		 * As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos seus
		 * colaboradores e lhe contraram para desenvolver o programa que calcular� os
		 * reajustes. Fa�a um programa que recebe o sal�rio de um colaborador e o
		 * reajuste segundo o seguinte crit�rio, baseado no sal�rio atual: sal�rios at�
		 * R$ 280,00 (incluindo) : aumento de 20% sal�rios entre R$ 280,00 e R$ 700,00 :
		 * aumento de 15% sal�rios entre R$ 700,00 e R$ 1500,00 : aumento de 10%
		 * sal�rios de R$ 1500,00 em diante : aumento de 5% Ap�s o aumento ser
		 * realizado, informe na tela: o sal�rio antes do reajuste; o percentual de
		 * aumento aplicado; o valor do aumento; o novo sal�rio, ap�s o aumento.
		 */

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double ajuste1;
		double ajuste2;
		double ajuste3;
		double ajuste4;
		double newSalary;

		System.out.print("Digite o sal�rio do colaborador R$ ");
		double salario = input.nextDouble();

		if (salario <= 280.00) {
			ajuste1 = salario * ((double) 20 / 100);
			newSalary = salario + ajuste1;
			System.out.printf("O sal�rio antes do reajuste � de: R$ %.2f\n", salario);
			System.out.println("O percentual de aumento aplicado � de 20%");
			System.out.printf("O valor do aumento � de: R$ %.2f\n", ajuste1);
			System.out.printf("O novo sal�rio � de: R$ %.2f\n", newSalary);
		} else if (salario > 280.00 && salario <= 700.00) {
			ajuste2 = salario * ((double) 15 / 100);
			newSalary = salario + ajuste2;
			System.out.printf("O sal�rio antes do reajuste � de: R$ %.2f\n", salario);
			System.out.println("O percentual de aumento aplicado � de 15%");
			System.out.printf("O valor do aumento � de: R$ %.2f\n", ajuste2);
			System.out.printf("O novo sal�rio � de: R$ %.2f\n", newSalary);
		} else if (salario > 700.00 && salario <= 1500.00) {
			ajuste3 = salario * ((double) 10 / 100);
			newSalary = salario + ajuste3;
			System.out.printf("O sal�rio antes do reajuste � de: R$ %.2f\n", salario);
			System.out.println("O percentual de aumento aplicado � de 10%");
			System.out.printf("O valor do aumento � de: R$ %.2f\n", ajuste3);
			System.out.printf("O novo sal�rio � de: R$ %.2f\n", newSalary);
		} else if (salario > 1500.00) {
			ajuste4 = salario * ((double) 5 / 100);
			newSalary = salario + ajuste4;
			System.out.printf("O sal�rio antes do reajuste � de: R$ %.2f\n", salario);
			System.out.println("O percentual de aumento aplicado � de 5%");
			System.out.printf("O valor do aumento � de: R$ %.2f\n", ajuste4);
			System.out.printf("O novo sal�rio � de: R$ %.2f\n", newSalary);
		}
		input.close();

	}

}

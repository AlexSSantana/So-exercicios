package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		/* Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas
		 *  no mês. Calcule e mostre o total do seu salário no referido mês
		 */
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora trabalhada");
		double horaTrabalhada = input.nextDouble();
		
		System.out.println("Quantas horas você trabalhou esse mês?");
		int horaMes = input.nextInt();
		
		double salarioMes = horaTrabalhada * horaMes;
		
		System.out.printf("O salário do mês é de: R$ %.2f\n", salarioMes);
		
		input.close();
	}

}

package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		/* Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas
		 *  no m�s. Calcule e mostre o total do seu sal�rio no referido m�s
		 */
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por hora trabalhada");
		double horaTrabalhada = input.nextDouble();
		
		System.out.println("Quantas horas voc� trabalhou esse m�s?");
		int horaMes = input.nextInt();
		
		double salarioMes = horaTrabalhada * horaMes;
		
		System.out.printf("O sal�rio do m�s � de: R$ %.2f\n", salarioMes);
		
		input.close();
	}

}

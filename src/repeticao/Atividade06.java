package repeticao;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		/*
		 * Altere o programa anterior permitindo ao usu�rio informar as popula��es e as
		 * taxas de crescimento iniciais. Valide a entrada e permita repetir a opera��o.
		 */
		
		Scanner input = new Scanner(System.in);
		
		int ano = 0;
		
		System.out.println("Digite a popula��o de A:");
		double a = input.nextDouble();
		System.out.println("Digitea porcentagem para acrescentar a popula�ao de A:");
		int porcento = input.nextInt();
		
		System.out.println("Digite a popula��o de B:");
		double b = input.nextDouble();
		System.out.println("Digitea porcentagem para acrescentar a popula�ao de B:");
		int porcento2 = input.nextInt();
		
		while (a < b) {
			a = a + (a * (double) (porcento / 100));
			b = b + (b * (double) (porcento2 / 100));
			ano = ano + 1;
			System.out.println(a);
			System.out.println(b);
			System.out.println("\n\n\n\n");
		}
		System.out.println(ano);
		input.close();

	}

}

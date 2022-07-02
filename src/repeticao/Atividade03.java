package repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que leia e valide as seguintes informa��es: Nome: maior que
		 * 3 caracteres; Idade: entre 0 e 150; Sal�rio: maior que zero; Sexo: 'f' ou
		 * 'm'; Estado Civil: 's', 'c', 'v', 'd';
		 */
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Digite um nome:");
		String name = input.nextLine();

		while (name.length() <= 3) {
			System.out.println("Digite um nome com mais de tr�s caracteres:");
			name = input.nextLine();
		}
		System.out.println("Digite uma idade:");
		int idade = input.nextInt();

		while (idade < 0 || idade > 150) {
			System.out.println("Idade inv�lida, digite novamente:");
		}
		System.out.println("Digite o sal�rio R$:");
		double salario = input.nextDouble();

		while (salario < 0) {
			System.out.println("Digite um sal�rio v�lido:");
		}
		System.out.println("Digite F para femenino ou M para masculino");
		char caracter = input.next().charAt(0);

		while (caracter != 'F' && caracter != 'M') {
			System.out.println("Digite um sexo v�lido");
		}
		System.out.println("Digite o estado c�vil: S, C, V ou D:");
		char estadoCivil = input.next().charAt(0);

		while (estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'V' && estadoCivil != 'D') {
			System.out.println("Digite um sexo v�lido:");
		}
		System.out.println("Fim da execu��o...");
		input.close();
	}

}

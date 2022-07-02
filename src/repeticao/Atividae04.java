package repeticao;

import java.util.Scanner;

public class Atividae04 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia um nome de usuário e a sua senha e não aceite a
		 * senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a
		 * pedir as informações.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o nome de usuario:");
		String name = input.nextLine();

		System.out.println("Digite uma senha:");
		String senha = input.nextLine();

		while (name.equalsIgnoreCase(senha)) {
			System.out.println("Senha inválida");
			System.out.println("Digite o nome de usuario:");
			name = input.nextLine();
			System.out.println("Digite uma senha:");
			senha = input.nextLine();
		}
		input.close();
	}

}

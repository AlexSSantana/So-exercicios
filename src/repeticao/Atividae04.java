package repeticao;

import java.util.Scanner;

public class Atividae04 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o aceite a
		 * senha igual ao nome do usu�rio, mostrando uma mensagem de erro e voltando a
		 * pedir as informa��es.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o nome de usuario:");
		String name = input.nextLine();

		System.out.println("Digite uma senha:");
		String senha = input.nextLine();

		while (name.equalsIgnoreCase(senha)) {
			System.out.println("Senha inv�lida");
			System.out.println("Digite o nome de usuario:");
			name = input.nextLine();
			System.out.println("Digite uma senha:");
			senha = input.nextLine();
		}
		input.close();
	}

}

package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que converta metros para centimetros
		 * 
		 */
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Digite um valor em metros:");
		int metros = input.nextInt();
		int cm = metros * 100;

		System.out.println(cm + " centim�tros");

		input.close();
	}

}

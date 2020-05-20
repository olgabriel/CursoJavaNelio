package Unidade3;

import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar a nota 1");
		int numero = teclado.nextInt();

		if (numero%2 == 0) //V==> o número é par 
			System.out.println("O número é par!");
		else
			System.out.println("O número é ímpar!");
		teclado.close();
	}

}

package Unidade3;

import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar a nota 1");
		int numero = teclado.nextInt();

		if (numero%2 == 0) //V==> o n�mero � par 
			System.out.println("O n�mero � par!");
		else
			System.out.println("O n�mero � �mpar!");
		teclado.close();
	}

}

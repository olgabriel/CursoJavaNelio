package Unidade4;

import java.util.Scanner;

public class AlgoritmoFatorial {

	public static void main(String[] args) {
		double fatorial=1;
		int numero;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o número");
		numero = teclado.nextInt();
		
	while(numero>=1)
	{
		fatorial = fatorial*numero;
		numero = numero-1;
		
	}
	
	System.out.println(" O fatorial do número escolhido é igual a "+fatorial);

	}

}

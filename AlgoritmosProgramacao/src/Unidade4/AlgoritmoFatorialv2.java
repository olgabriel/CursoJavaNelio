package Unidade4;

import java.util.Scanner;

public class AlgoritmoFatorialv2 {

	public static void main(String[] args) {
		double fatorial=1;
		int numero;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o número");
		numero = teclado.nextInt();
		
	do
	{
		fatorial = fatorial*numero;
		numero = numero-1;
		
	}while(numero>=1);
	
	System.out.println(" O fatorial do número escolhido é igual a "+fatorial);

	}

}

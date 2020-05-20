package Unidade4;

import java.util.Scanner;

public class Numerodecrescente {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor do número");
		numero = teclado.nextInt();
		
		for (int i=numero; i>=1; i=i-1)
		{
			System.out.println("Número="+i);
			
		}
		
		
		
		
	}

}

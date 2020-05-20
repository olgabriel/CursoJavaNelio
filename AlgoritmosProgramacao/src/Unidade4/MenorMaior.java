package Unidade4;

import java.util.Scanner;

public class MenorMaior {

	public static void main(String[] args) {
		
		int numero, menor, maior;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar um número");
		numero = teclado.nextInt();
		
		menor = numero;
		maior = numero;
		
		
		for ( int i=2; i<=10; i++)
		{
			Scanner teclado1 = new Scanner(System.in);
			System.out.println("Favor informar um número");
			numero = teclado1.nextInt();
			
			if (numero<menor)
				menor=numero;
			
			else if (numero>maior)
				maior=numero;
			
		}
		
		System.out.println(" O menor número foi "+menor);
		System.out.println(" O maior número foi "+maior);
		
	
		


	}

}

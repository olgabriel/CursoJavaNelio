package Unidade4;

import java.util.Scanner;

public class MenorMaior {

	public static void main(String[] args) {
		
		int numero, menor, maior;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar um n�mero");
		numero = teclado.nextInt();
		
		menor = numero;
		maior = numero;
		
		
		for ( int i=2; i<=10; i++)
		{
			Scanner teclado1 = new Scanner(System.in);
			System.out.println("Favor informar um n�mero");
			numero = teclado1.nextInt();
			
			if (numero<menor)
				menor=numero;
			
			else if (numero>maior)
				maior=numero;
			
		}
		
		System.out.println(" O menor n�mero foi "+menor);
		System.out.println(" O maior n�mero foi "+maior);
		
	
		


	}

}

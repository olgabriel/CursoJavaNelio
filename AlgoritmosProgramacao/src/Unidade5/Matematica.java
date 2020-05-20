package Unidade5;

import java.util.Scanner;

public class Matematica {
	
	public static void tabuada(int numero)
	{
		int total;
		for (int i=1;i<=10;i++)
		{
			total = numero*i;
			System.out.println("Número:"+numero+"x"+i+"="+total);
			
		}	
	}

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor do número");
		int numero = teclado.nextInt();
		tabuada(numero);
		
		teclado.close();

	}

}

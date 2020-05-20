package Unidade4;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o número A");
		a = teclado.nextInt();
		
		System.out.println("Favor informar o número B");
		b = teclado.nextInt();
		
		for (int i=a+1;i<b;i++)
		{
			if (i%2==0)
				System.out.println("O número:"+i+" é par");
		}
		
		teclado.close();

	}

}

package Unidade4;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o n�mero A");
		a = teclado.nextInt();
		
		System.out.println("Favor informar o n�mero B");
		b = teclado.nextInt();
		
		for (int i=a+1;i<b;i++)
		{
			if (i%2==0)
				System.out.println("O n�mero:"+i+" � par");
		}
		
		teclado.close();

	}

}

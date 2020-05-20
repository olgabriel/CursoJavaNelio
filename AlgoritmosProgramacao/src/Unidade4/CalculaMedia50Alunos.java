package Unidade4;

import java.util.Scanner;

public class CalculaMedia50Alunos {

	public static void main(String[] args) {
		
		
		final double numero_avaliacoes = 4; //constante
		double nota1, nota2, nota3, nota4; //variáveis
		double media, media50alunos= 0; 
		int i;
		
		for (i = 1; i<=5; i++)
		{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar a nota 1");
		nota1 = teclado.nextDouble();
		System.out.println("Favor informar a nota 2");
		nota2 = teclado.nextDouble();
		System.out.println("Favor informar a nota 3");
		nota3 = teclado.nextDouble();
		System.out.println("Favor informar a nota 4");
		nota4 = teclado.nextDouble();
		
		media = (nota1+nota2+nota3+nota4)/numero_avaliacoes;
		
		media50alunos = media50alunos + media;
		
		
		}
		
		media50alunos = media50alunos/i;
		
		System.out.println("A media aritmetica é "+media50alunos);


		
	}

}

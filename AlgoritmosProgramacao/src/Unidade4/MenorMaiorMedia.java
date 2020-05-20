package Unidade4;

import java.util.Scanner;

public class MenorMaiorMedia {

	public static void main(String[] args) {
        double valor, menor,maior, media=0;
        int cont=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o valor");
		valor = teclado.nextDouble();
		menor = valor;
		maior = valor;
		
		while(valor!=0)
		{
			cont++;
			if (valor < menor)
				menor = valor;
			else if (valor > maior)
				maior = valor;
			media = media + valor;
			System.out.println("Favor informar o valor");
			valor = teclado.nextDouble();
		}
		media = media/cont;
		
		System.out.println("O menor valor é:"+menor);
		System.out.println("O maior valor é:"+maior);
		System.out.println("A média dos valores é:"+media);

	}

}

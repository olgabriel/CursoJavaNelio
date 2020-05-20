package Unidade3;

import javax.swing.JOptionPane;

public class CaixaEtronico {

	public static void main(String[] args) {
		int saque;
		double notas100, notas50, notas10;
		int resto;
		
		saque =  Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do saque"));
		
		if (saque%10 == 0)
		{
			notas100 = Math.floor(saque/100);
			resto = saque % 100;
			notas50 = Math.floor(resto/50);
			resto = resto % 50;
			notas10 = Math.floor(resto/10);
			
			if (notas100>0)
				JOptionPane.showMessageDialog(null, "Número de notas de 100 = "+notas100);
			if (notas50>0)
				JOptionPane.showMessageDialog(null, "Número de notas de 50 = "+notas50);
			if (notas10>0)
				JOptionPane.showMessageDialog(null, "Número de notas de 10 = "+notas10);
		
			
		}
		else 
			JOptionPane.showMessageDialog(null, "Não é possível realizar o saque do valor solicitado");

	}

}

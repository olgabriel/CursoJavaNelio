package Unidade3;

import javax.swing.JOptionPane;

public class FormaPagamento {

	public static void main(String[] args) {
		double valor, valor_final;
		int forma_Pg;
		
		valor =  Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto"));
		forma_Pg =  Integer.parseInt(JOptionPane.showInputDialog("Diga a forma de pagamento escolhida [1-A vista] [2-Cr�dito] [3-Duas vezes] [4-Tr�s vezes]"));
		
		switch (forma_Pg) 
		{
		    case 1 : 
		    	valor_final = (valor-(valor*0.1));
			    JOptionPane.showMessageDialog(null,"O valor � vista, com 10% de desconto � de "+valor_final); 
			    break;
		    case 2 : 
		    	valor_final = (valor-(valor*0.05));
			    JOptionPane.showMessageDialog(null,"O valor no cr�dito, com 5% de desconto � de "+valor_final); 
			    break;
		    case 3 : 
		    	valor_final = (valor);
			    JOptionPane.showMessageDialog(null,"O valor em duas vezes s/ juros � de "+valor_final); 
			break;
		    case 4 : 
		    	valor_final = (valor+(valor*0.1));
			    JOptionPane.showMessageDialog(null,"O valor em tr�s vezes c/ juros de 10% � de "+valor_final); 
			break;

		default:
		{	
			JOptionPane.showMessageDialog(null," Op��o digitada incorreta"); 
			FormaPagamento.main(null);
		}
		
		
		
	}



	}
	
}



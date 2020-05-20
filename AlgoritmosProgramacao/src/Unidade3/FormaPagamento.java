package Unidade3;

import javax.swing.JOptionPane;

public class FormaPagamento {

	public static void main(String[] args) {
		double valor, valor_final;
		int forma_Pg;
		
		valor =  Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto"));
		forma_Pg =  Integer.parseInt(JOptionPane.showInputDialog("Diga a forma de pagamento escolhida [1-A vista] [2-Crédito] [3-Duas vezes] [4-Três vezes]"));
		
		switch (forma_Pg) 
		{
		    case 1 : 
		    	valor_final = (valor-(valor*0.1));
			    JOptionPane.showMessageDialog(null,"O valor à vista, com 10% de desconto é de "+valor_final); 
			    break;
		    case 2 : 
		    	valor_final = (valor-(valor*0.05));
			    JOptionPane.showMessageDialog(null,"O valor no crédito, com 5% de desconto é de "+valor_final); 
			    break;
		    case 3 : 
		    	valor_final = (valor);
			    JOptionPane.showMessageDialog(null,"O valor em duas vezes s/ juros é de "+valor_final); 
			break;
		    case 4 : 
		    	valor_final = (valor+(valor*0.1));
			    JOptionPane.showMessageDialog(null,"O valor em três vezes c/ juros de 10% é de "+valor_final); 
			break;

		default:
		{	
			JOptionPane.showMessageDialog(null," Opção digitada incorreta"); 
			FormaPagamento.main(null);
		}
		
		
		
	}



	}
	
}



package Unidade3;

import javax.swing.JOptionPane;

public class Moeda {

	public static void main(String[] args) {
		
		double valor, conversao;
		int tipo_moeda;
		
		valor =  Double.parseDouble(JOptionPane.showInputDialog("Informe o valor"));
		tipo_moeda =  Integer.parseInt(JOptionPane.showInputDialog("Informe a moeda [1-Libra][2-Dólar][3-Euro]"));
		
		switch (tipo_moeda) 
		{
		    case 1 : //Libra
		    	conversao = valor/5;
			    JOptionPane.showMessageDialog(null,"O valor em convertido em Libras é "+conversao); 
			    break;
		    case 2 : //Dolar
		    	conversao = valor/4;
			    JOptionPane.showMessageDialog(null,"O valor em convertido em Dolar é "+conversao); 
			    break;
		    case 3 : //Euro
		    	conversao = valor/4.4;
			    JOptionPane.showMessageDialog(null,"O valor em convertido em Euro é "+conversao); 
			break;

		default:
			JOptionPane.showMessageDialog(null," Opção digitada incorreta"); 
		}
		
		
		
	}

}

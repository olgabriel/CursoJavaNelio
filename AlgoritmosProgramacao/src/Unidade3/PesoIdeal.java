package Unidade3;

import javax.swing.JOptionPane;

public class PesoIdeal {

	public static void main(String[] args) {
		double altura,peso_homem,peso_mulher;
		String sexo;
		
	    altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
	    sexo = JOptionPane.showInputDialog("Digite M para homem e F para mulher");
	    
	    if (sexo.equalsIgnoreCase("M"))
	    { peso_homem = (72.7 * altura) - 58;
	    JOptionPane.showMessageDialog(null,"Seu peso ideal é de "+peso_homem+" Kg");
	    }
	
	    else
	    {
	    	peso_mulher = (62.1 * altura)-44.7;
	    	JOptionPane.showMessageDialog(null,"Seu peso ideal é de "+peso_mulher+" Kg");
	    }

	}

}

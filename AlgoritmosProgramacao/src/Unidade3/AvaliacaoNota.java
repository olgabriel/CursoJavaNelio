package Unidade3;

import javax.swing.JOptionPane;

public class AvaliacaoNota {

	public static void main(String[] args) {
		int nota;
		
		nota =  Integer.parseInt(JOptionPane.showInputDialog("Digite a nota"));
        
		if ((nota>=0) && (nota<=100))
		{
			if (nota>=90)
				JOptionPane.showMessageDialog(null, "Nota Excelente!");
			else if (nota>=70)
				JOptionPane.showMessageDialog(null, "Nota Boa!");
			else if (nota>=50)
				JOptionPane.showMessageDialog(null, "Nota Regular");
			else 
				JOptionPane.showMessageDialog(null, "Nota Insuficiente");
			
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "Nota Inválida");
		    AvaliacaoNota.main(null); 
		}
		
	}

}

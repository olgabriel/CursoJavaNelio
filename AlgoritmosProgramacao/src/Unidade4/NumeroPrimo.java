package Unidade4;

import javax.swing.JOptionPane;

public class NumeroPrimo {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero"));
		int numero_divisores = 0, i;
		
		for (i=1; i<=numero;i++)
		{
			if (numero%i==0)
				numero_divisores++;
		}
		
		if (numero_divisores==2)
			JOptionPane.showMessageDialog(null, "Numero:"+numero+"� primo");
		else 
			JOptionPane.showMessageDialog(null, "Numero:"+numero+"n�o � primo");
		
		
		
	

	}

}

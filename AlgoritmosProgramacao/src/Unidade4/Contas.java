package Unidade4;

import javax.swing.JOptionPane;

public class Contas {

	public static void main(String[] args) {
		
		var descricao_conta = JOptionPane.showInputDialog("Digite o nome da conta");
		var valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu valor"));
		int numero_contas = 0;
		double valor_total=0;
		while(valor>0)
		{
			JOptionPane.showMessageDialog(null, "Conta:"+descricao_conta+" - valor:"+valor);
			numero_contas++;
			valor_total = valor_total + valor;
			descricao_conta = JOptionPane.showInputDialog("Digite o nome da conta");
			valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu valor"));
		}
		
		JOptionPane.showMessageDialog(null, "Número de Conta(s):"+numero_contas+" Total:"+valor_total);
	

	}

}

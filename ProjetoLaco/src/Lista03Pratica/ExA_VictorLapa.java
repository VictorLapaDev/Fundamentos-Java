package Lista03Pratica;

import javax.swing.JOptionPane;

public class ExA_VictorLapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JOptionPane.showMessageDialog(null, "Os números ao quadrado de 15 a 200 são:");
		
		String tabela = "";
		for(int i = 15; i<=200; i++) {
			
			double quadrado = Math.pow(i, 2);
			
			tabela+= "O número "+i+" ao quadrado é igual a: "+quadrado+"\n";
		}
		
		JOptionPane.showMessageDialog(null, tabela);
		
	}

}

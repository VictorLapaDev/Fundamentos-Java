package Lista03Pratica;

import javax.swing.JOptionPane;

public class ExD_VictorLapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	JOptionPane.showInternalMessageDialog(null, "A soma de todos os números pares de 0 até 500 é:");
		
		int result = 0;
		
		for(int i = 0; i<=500; i = i+2) {
		 result = result + i;
		}
		
		JOptionPane.showInternalMessageDialog(null, result);
		
		
	}

}

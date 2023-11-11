package Lista03Pratica;

import javax.swing.JOptionPane;

public class ExC_VictorLapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JOptionPane.showInternalMessageDialog(null, "A soma de todos os números de 1 até 100 é:");
		
		int result = 0;
		
		for(int i = 0; i<=100; i++) {
		 result = result + i;
		}
		
		JOptionPane.showInternalMessageDialog(null, result);
		
		
	}

}

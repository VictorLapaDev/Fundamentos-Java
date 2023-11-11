package Lista03Pratica;

import javax.swing.JOptionPane;

public class ExF_VictorLapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JOptionPane.showInternalMessageDialog(null, "A seguir você verá todos os números divisíveis por 4 até 200!!");
		
		String divi = "";
		for(int i = 0; i<=200; i= i+4) {
			
			if(i==0) {
				i=4;
			}
			
			divi += "O número "+i+" é divisível por 4\n";
		}
		
		JOptionPane.showInternalMessageDialog(null, divi);
	}

}

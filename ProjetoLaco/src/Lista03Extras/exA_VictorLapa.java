package Lista03Extras;

import javax.swing.JOptionPane;

public class exA_VictorLapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JOptionPane.showInternalMessageDialog(null, "A seguir você verá o número 3 elevado as pôtencias de 0 até 15!!");
		
		String lista = "";
		long result = 0;
		for(int i = 0; i<16; i++) {
			result = (long)Math.pow(3, i);
			
			lista += "3^"+i+" é igual a: "+result+"\n";
		}
		
		JOptionPane.showInternalMessageDialog(null, lista);
	}

}

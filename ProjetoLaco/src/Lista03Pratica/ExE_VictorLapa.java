package Lista03Pratica;

import javax.swing.JOptionPane;

public class ExE_VictorLapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JOptionPane.showInternalMessageDialog(null, "A seguir você verá todos os números ímpares entre 0 e 20!");
		
		String sla = "";
		for(int i = 1; i<=20; i= i+2){
			int num = i;
			sla += "O número "+num+" é ímpar\n";
		}
		
		JOptionPane.showInternalMessageDialog(null, sla);
	}

}

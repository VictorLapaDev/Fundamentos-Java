package Lista03Pratica;

import javax.swing.JOptionPane;

public class ExB_VictorLapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = JOptionPane.showInputDialog("Insira o número que você quer saber a tabuada:");
		int num = Integer.parseInt(input);
		
		String tabuada = "";
		
		for(int i = 1; i<=10; i++) {
		int	result = num * i;
			
		tabuada += num+ " X " +i+ " é igual a = "+result+"\n";
		}
		
		JOptionPane.showInternalMessageDialog(null, tabuada);
	}

}

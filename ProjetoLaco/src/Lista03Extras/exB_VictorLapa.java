package Lista03Extras;

import javax.swing.JOptionPane;

public class exB_VictorLapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = JOptionPane.showInputDialog("Até que número da sequencia de Fibonacci você deseja ver?");
		int last = Integer.parseInt(input);
		
		String lista = "";
		int atual= 1;
		int anterior = 0;
		
		lista += "O 1° número da sequência de Fibonacci é "+anterior+"\n";
		lista += "O 2° número da sequência de Fibonacci é "+atual+"\n";
		
		for(int i = 3; i <= last; i++) {
			
			 int temp = atual;
			 atual = atual + anterior;
			 anterior = temp;
		
		lista += "O "+i+"° número da sequência de Fibonacci é "+atual+"\n";
		}
		
		JOptionPane.showInternalMessageDialog(null, lista);
		
	}

}

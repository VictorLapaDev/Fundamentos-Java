package Lista03Extras;

import javax.swing.JOptionPane;

public class exC_VictorLapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showInternalMessageDialog(null, "Escolha um valor inicial e um final para saber quantos números pares e ímpares há de um para outro!");
		
		String input1 = JOptionPane.showInputDialog("Escolha um valor inicial:");
		int ValI = Integer.parseInt(input1);
		
		String input2 = JOptionPane.showInputDialog("Escolha um valor final:");
		int ValF = Integer.parseInt(input2);
		
		
		int par = 0;
		int impar = 0;
		
		
		for(int i = ValI; i <= ValF; i++) {
			if(i % 2 == 0) {
				 par += 1;
			}else {
				impar += 1;
			}
		}
		JOptionPane.showInternalMessageDialog(null, "A quantidade de número pares é de "+par+"\nA quantidade de números ímpares é de "+impar);
		
	}

}

package Laço_Exercicios;

import javax.swing. JOptionPane;
public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = JOptionPane.showInputDialog("Escreva o número para saber seu fatorial: ");
		int num = Integer.parseInt(input);
		
		int fatorial = 1;
		
		for(int i = num; i >=1; i--) {
			fatorial *= i;
		}
		
		JOptionPane.showMessageDialog(null, "O fatorial de "+num+" é igual a: "+fatorial);
		
		
	}

}

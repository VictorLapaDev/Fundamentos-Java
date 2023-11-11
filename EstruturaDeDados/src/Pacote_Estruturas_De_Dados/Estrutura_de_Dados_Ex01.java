package Pacote_Estruturas_De_Dados;

import java.util.*;
import javax.swing.JOptionPane;

public class Estrutura_de_Dados_Ex01 {

	public static void main(String[] args) {
		
		//declara a arraylist e as variaveis
		ArrayList<String> contatos = new ArrayList<>();
		String exibirLista = "";
		String continuar = "sim";
		boolean continuarboolean;
		
		do {
		String inputAçao = JOptionPane.showInputDialog("Digite um número para escolher o que deseja fazer com sua lista de contatos:"
				+ "\n1-Adicionar Contato"
				+ "\n2-Listar todos Contatos"
				+ "\n3-Atualizar algum Contato"
				+ "\n4-Excluir Contatos"
				+ "\n5-Sair");
		int acao = Integer.parseInt(inputAçao);
		
		switch(acao) {
		case 1: 
			String nome = JOptionPane.showInputDialog("Insira o nome do contato:");
			String telefone = JOptionPane.showInputDialog("Insira o número da pessoa:");
			String email = JOptionPane.showInputDialog("Insira o email da pessoa:");
			contatos.add("Nome: "+nome + "\nTelefone: "+ telefone + "\nEmail: "+email);
			
			break;
		case 2: 
			for(String contato : contatos) {
				exibirLista += (contato + "\n\n");
			}
			JOptionPane.showInternalMessageDialog(null, "Estes são seus contatos:\n" + exibirLista);
			exibirLista = null;
	
			break;
		case 3: 
			
			break;
		case 4: 
			
			break;
		case 5: 
			
			break;
		default: 
			JOptionPane.showInternalMessageDialog(null, "O número inserido é inválido");
			break;
			}
		
		String continuarInput = JOptionPane.showInputDialog("Deseja continuar a ver os contatos?\nDigite sim ou não");
		
		 continuarboolean = continuar.equalsIgnoreCase(continuarInput);
		
		
		}	while(continuarboolean);
		
		JOptionPane.showInternalMessageDialog(null, "Obrigado pela ajuda :)");
		
		}
			
	}



package Pacote_Estruturas_De_Dados;

import javax.swing.JOptionPane;
import java.util.*;
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		   ArrayList<String[]> listaDeContatos = new ArrayList<>();

	        while (true) {
	            int escolha = Integer.parseInt(JOptionPane.showInputDialog(
	                    "Escolha uma opção:\n" +
	                    "1. Adicionar\n" +
	                    "2. Listar\n" +
	                    "3. Atualizar\n" +
	                    "4. Excluir\n" +
	                    "5. Sair"));

	            switch (escolha) {
	                case 1: // Adicionar
	                    String nome = JOptionPane.showInputDialog("Nome do contato:");
	                    String telefone = JOptionPane.showInputDialog("Telefone:");
	                    String email = JOptionPane.showInputDialog("Email:");
	                    String[] novoContato = {nome, telefone, email};
	                    listaDeContatos.add(novoContato);
	                    break;
	                case 2: // Listar
	                    StringBuilder lista = new StringBuilder();
	                    for (String[] contato : listaDeContatos) {
	                        lista.append("Nome: " + contato[0] + ", Telefone: " + contato[1] + ", Email: " + contato[2] + "\n");
	                    }
	                    JOptionPane.showMessageDialog(null, "Lista de Contatos:\n" + lista.toString());
	                    break;
	                case 3: // Atualizar
	                    String nomeAtualizar = JOptionPane.showInputDialog("Nome do contato para atualizar:");
	                    for (String[] contato : listaDeContatos) {
	                        if (contato[0].equalsIgnoreCase(nomeAtualizar)) {
	                            String novoNome = JOptionPane.showInputDialog("Novo nome:");
	                            contato[1] = JOptionPane.showInputDialog("Novo telefone:");
	                            contato[2] = JOptionPane.showInputDialog("Novo email:");
	                            contato[0] = novoNome;
	                            JOptionPane.showMessageDialog(null, "Contato atualizado com sucesso.");
	                            break;
	                        }
	                    }
	                    break;
	                case 4: // Excluir
	                    String nomeExcluir = JOptionPane.showInputDialog("Nome do contato para excluir:");
	                    String[] contatoExcluir = null;
	                    for (String[] contato : listaDeContatos) {
	                        if (contato[0].equalsIgnoreCase(nomeExcluir)) {
	                            contatoExcluir = contato;
	                            break;
	                        }
	                    }
	                    if (contatoExcluir != null) {
	                        listaDeContatos.remove(contatoExcluir);
	                        JOptionPane.showMessageDialog(null, "Contato excluído com sucesso.");
	                    } else {
	                        JOptionPane.showMessageDialog(null, "Contato não encontrado.");
	                    }
	                    break;
	                case 5: // Sair
	                    JOptionPane.showMessageDialog(null, "Saindo do programa.");
	                    System.exit(0);
	                    break;
	                default:
	                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
	                    break;
	            }
	        }

	}

}

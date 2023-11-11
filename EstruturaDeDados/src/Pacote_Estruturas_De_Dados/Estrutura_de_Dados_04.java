package Pacote_Estruturas_De_Dados;

import java.util.*;

public class Estrutura_de_Dados_04 {

	public static void main(String[] args) {
		//Vamos declarar um arraylist de frutas
		ArrayList<String> frutas = new ArrayList<>();
		
		frutas.add("Maçã");
		frutas.add("Banana");
		frutas.add("Morango");
		frutas.add("Manga");
		frutas.add("Limão");
		
		//vamos criar um objeto para receber a entrada de dados
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite uma fruta para pesquisar no array: ");
		String frutaPesquisa = scn.nextLine();
		
		//vamos declarar uma variavel do tipo booleana para verificar se a fruta esta na lista 
		boolean encontrou = false;
		
		for(String fruta : frutas) {
			if(fruta.equalsIgnoreCase(frutaPesquisa)){
				encontrou = true;
				break;
			}
		}
		
		if(encontrou == true) {
			System.out.println(frutaPesquisa + " foi encontrada!");
		} else {
			System.out.println(frutaPesquisa + " não foi encontrada!");
		}
	}

}

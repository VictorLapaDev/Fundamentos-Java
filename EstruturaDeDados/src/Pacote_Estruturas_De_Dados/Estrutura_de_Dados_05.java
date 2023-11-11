package Pacote_Estruturas_De_Dados;

import java.util.*;

public class Estrutura_de_Dados_05 {

	public static void main(String[] args) {
		
		ArrayList<String> frutas = new ArrayList<>();
		
		frutas.add("Uva");
		frutas.add("Pera");
		frutas.add("Melancia");
		frutas.add("Goiaba");
		
		//vamos acessar o elemento pelo indice
		String indiceFruta = frutas.get(1);
		System.out.println("Fruta encontrada é: " + indiceFruta);
		
		//Vamos remover um elemento pelo valor
		frutas.remove("Pera");
		System.out.println("Frutas após remover pera: " + frutas);
		
		//vamos pesquisar se uma fruta existe no arraylist
		//returns true if this list contains the specified element.
		boolean contemFruta = frutas.contains("Limão");
		System.out.println("O ArrayList contém " + contemFruta);
		
		// vamos apagar todos os elementos do vetor
		frutas.clear();
		System.out.println("ArrayList vazio: " + frutas.isEmpty());
		
		
	}

}

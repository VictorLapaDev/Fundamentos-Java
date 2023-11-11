package Pacote_Estruturas_De_Dados;

import java.util.ArrayList;

public class Estrutura_de_Dados_01 {

	public static void main(String[] args) {


		//vamos declarar uma arraylist de strings
		ArrayList<String> nomes = new ArrayList<>();
		
		//vamos adicionar alguns nomes no arraylist
		nomes.add("Miguel 1");
		nomes.add("Miguel 2");
		nomes.add("Miguelito");
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
//		System.out.println(nomes.get(1));
//		System.out.println(nomes.get(2));
//		System.out.println(nomes.get(3));
	}

}

package Pacote_Estruturas_De_Dados;

import java.util.*;

public class Estrutura_de_Dados_03 {

	public static void main(String[] args) {

		ArrayList<Double> precos = new ArrayList<>();
		
		
		precos.add(1.99);
		precos.add(2.99);
		precos.add(3.99);
		
		double soma = 0;
		for(double preco : precos) {
			soma += preco;
		}
		System.out.println("Soma = " +soma);
		System.out.println("Media = " + soma / precos.size());
		
	}

}

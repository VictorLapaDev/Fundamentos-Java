package Pacote_Tipos_Operadores;

import java.util.Scanner;

public class Classe_Prestacao {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		//Entrada
		System.out.println("Digite o Valor: ");
		float val = scn.nextFloat();
		System.out.println("Digite a Taxa: ");
		float taxa = scn.nextFloat();
		System.out.println("Digite o Tempo em meses: ");
		float temp = scn.nextFloat();
		
		//Processamento
		float prest = val + (val * (taxa / 100) * temp);
		
		//Saida
		System.out.printf("O valor da prestação é de = R$ %.2f" , (prest));
	}

}

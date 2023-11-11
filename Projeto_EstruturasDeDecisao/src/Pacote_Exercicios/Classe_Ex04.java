package Pacote_Exercicios;

import java.util.Scanner;

public class Classe_Ex04 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite o código do lanche:");
		int cod = scn.nextInt();
		
		switch(cod) {
		case 1:
			System.out.println("BigMac");
			break;
		case 2:
			System.out.println("Quarteirão");
			break;
		case 3:
			System.out.println("McChiken");
			break;
		case 4:
			System.out.println("Cheddar McMelt");
			break;
		case 5:
			System.out.println("MxMax");
			break;
		default:
			System.out.println("Código de lanche invalido");
		}
	}

}

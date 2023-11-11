package Pacote_Exercicios;

import java.util.Scanner;

public class Classe_Ex02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite o número do código da profissão: ");
		int cod = scn.nextInt();
		
		
		switch (cod) {
		case 1:
			System.out.println("Matemático");
			break;
		case 2:
			System.out.println("Analista de sistemas");
			break;
		case 3:
			System.out.println("Físico");
			break;
		case 4:
			System.out.println("Arquiteto");
			break;
		case 5:
			System.out.println("Piloto de aeronaves");
			break;
			default:
				System.out.println("Código invalido");
		}
		

	}
}

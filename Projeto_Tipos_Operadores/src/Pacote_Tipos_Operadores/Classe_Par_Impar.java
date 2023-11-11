package Pacote_Tipos_Operadores;

import java.util.Scanner;

public class Classe_Par_Impar {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		// Entrada
		System.out.print("Digite um valor numérico inteiro: ");
		int num = scn.nextInt();
		
		// Processamento + Saída
		if(num % 2 == 0) {
			System.out.print("O número é par");
		}
		else {
			System.out.print("O número é ímpar");
		}
		
	}

}

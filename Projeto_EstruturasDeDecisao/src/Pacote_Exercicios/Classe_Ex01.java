package Pacote_Exercicios;

import java.util.Scanner;

public class Classe_Ex01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		System.out.println("Digite uma idade para descobrir a sua faixa etária: ");
		int idade = scn.nextInt();
		
		if(idade<=12) {
			System.out.println("Esta idade tem a faixa etária classificada como criança");
		}else if(idade<=17) {
			System.out.println("Esta idade tem a faixa etária classificada como adolescente");
		}else if(idade<=59) {
			System.out.println("Esta idade tem a faixa etária classificada como Adulto");
		}else {
			System.out.println("Esta idade tem a faixa etária classificada como especialista");
		}
		
		
	}

}

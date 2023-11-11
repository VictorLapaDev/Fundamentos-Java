package Pacote_Exercicios;

import java.util.Scanner;

public class Classe_Ex05 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite sua altura para descobrir seu IMC");
		float altu = scn.nextFloat();
		System.out.println("Digite o seu peso: ");
		float  peso = scn.nextFloat();
		
		double imc = peso / Math.pow(altu, altu);
		
		if(imc<18) {
			System.out.printf("Seu imc é de %.2f e esta classificado como magreza",imc);
		}else if(imc<=24.9) {
			System.out.printf("Seu imc é de %.2f e esta classificado como saudavel",imc);
		}else if(imc<=29.9) {
			System.out.printf("Seu imc é de %.2f e esta classificado como sobrepeso",imc);
		}else {
			System.out.printf("Seu imc é de %.2f e esta classificado como obesidade",imc);
		}
		
		
	}

}

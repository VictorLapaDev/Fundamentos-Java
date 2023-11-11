package Pacote_Exercicios;

import java.util.Scanner;

public class Classe_Ex03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite a velocidade em que o motorista estava dirigindo: ");
		float vel = scn.nextFloat();
		System.out.println("Digite a velocidade permitida na pista: ");
		float velmax = scn.nextFloat();
		
		
		if(vel>(velmax+30)){
			System.out.println("A multa será de 200,00R$");
		}else if(vel>(velmax+10)){
			System.out.println("A multa será de 100,00R$");
		}else if(vel>velmax) {
			System.out.println("A multa será de 50,00R$");
		}else {
			System.out.println("Não há multa");
		}
	}

}

package Pacote_Tipos_Operadores;

import java.util.Scanner;

public class Classe_Litros {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		//Entrada
		System.out.print("Digite o tempo gasto ma viagem: ");
		float temp = scn.nextFloat();
		System.out.print("Digite a velocidade média da viagem: ");
		float vel = scn.nextFloat();
		
		//Processamento
		float dis = vel * temp;
		float litros = dis / 12;
		
		//Saida
		System.out.println("A velocidade é de: " + vel);

		System.out.println("O tempo gasto é de: " + temp);

		System.out.println("A distância é de: " + dis);

		System.out.println("A quantidade de litros é de: " + litros);
		
		
	}

}

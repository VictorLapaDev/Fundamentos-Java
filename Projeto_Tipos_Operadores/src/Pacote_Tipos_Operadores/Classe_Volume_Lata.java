package Pacote_Tipos_Operadores;

import java.util.Scanner;
import java.lang.Math;


public class Classe_Volume_Lata {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		//Entrada
		System.out.print("Coloque o valor do Raio  do cilindro: ");
		double raio = scn.nextDouble();
		System.out.print("Coloque a altura: ");
		double altura = scn.nextDouble();

		//processamento
		double vol = 3.14159 * Math.pow(raio, 2) * altura;
		
		//saida
		System.out.print(vol);
	}

}

package Pacote_Tipos_Operadores;

import java.util.Scanner;

public class Classse_C_to_F {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		//Entrada
		System.out.print("Digite uma temperatura para graus Celcius: ");
		float tempC= scn.nextFloat();
		
		//Processamento 
		float tempF= tempC * 9 / 5 + 32;
		
		//Saída
		System.out.print(tempF);
	}

}

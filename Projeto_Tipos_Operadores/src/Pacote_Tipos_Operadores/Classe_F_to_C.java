package Pacote_Tipos_Operadores;

import java.util.Scanner;

public class Classe_F_to_C {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		
		//Entrada
		System.out.print("Digite uma temperatura de graus Fahrenheit para graus Celsius: ");
		float tempF = scn.nextFloat();
		
		//processamento
	    float tempC = (tempF - 32) * 5 / 9;
	    
	    //Saída
	    System.out.print(tempC);
	    
	}

}

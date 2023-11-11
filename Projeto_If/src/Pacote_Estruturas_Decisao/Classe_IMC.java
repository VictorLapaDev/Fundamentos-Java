package Pacote_Estruturas_Decisao;

import java.lang.Math.*;

public class Classe_IMC {

	public static void main(String[] args) {

		double peso = 69;
		double altu = 1.68;
		
		
		double imc = peso / Math.pow(altu, 2);
		
		if(imc < 18.5) {
			System.out.print("Abaixo do peso");
		} else if(imc < 24.9) {
			System.out.print("Peso normal");
		} else if(imc < 29.9) {
			System.out.print("Sobrepeso");
		} else if(imc < 34.9) {
			System.out.print("Obesidade grau 1");
		} else {
			System.out.print("Obesidade grau 2");
		}
		
	}

}

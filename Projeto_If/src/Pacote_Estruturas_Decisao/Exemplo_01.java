package Pacote_Estruturas_Decisao;

public class Exemplo_01 {

	public static void main(String[] args) {

		float nota1 = 7;
		float nota2 = 8;
		
		float mf = (nota1 + nota2) / 2;
		
		//Exemplo de estrutura de decisão simples
		if(mf >= 5) {
			System.out.printf("Média final = %.2f e você está aprovado", mf);
		}
	}

}

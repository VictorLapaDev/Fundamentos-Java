package Pacote_Estruturas_Decisao;

public class Exemplo_03 {

	public static void main(String[] args) {

		float nota1 = 7;
		float nota2 = 6;
		
		float mf = (nota1 + nota2) / 2;
		
		if(mf>=7) {
			System.out.print("Aprovado");
		}
		else if(mf<5) {
			System.out.print("Reprovado");
		}
		else {
			System.out.print("Recuperação");
		}
	}

}

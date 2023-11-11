package Vetor_Matrizes;

public class Matriz3x2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] numeros = { {1, 2}, {3, 4}, {5, 6} };
		
			for(int linha = 0; linha <3; linha++ ) {
				for(int coluna = 0; coluna < 2; coluna ++) {
					System.out.println(numeros[linha][coluna]);
				}
			}
	}

}

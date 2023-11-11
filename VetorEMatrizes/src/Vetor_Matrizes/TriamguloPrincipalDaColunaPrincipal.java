package Vetor_Matrizes;
import java.util.Scanner;

public class TriamguloPrincipalDaColunaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int[][] ma = new int[3][3];
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print("Digite o num[" + i + "][" + j + "] : ");
				ma[i][j] = scn.nextInt();
			}
		}
		
		
			for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {		
			//linha < coluna ou coluna > linha 		
					if(i < j) {
						System.out.println("O número nums[" + i + "][" + j + "] é igual a " +ma[i][j]);
					}
				}
			}
			scn.close();
	}

}

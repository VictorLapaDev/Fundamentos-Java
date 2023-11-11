package Vetor_Matrizes;
import java.util.Scanner;
public class DiagonalSecundaria {

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
					if(i + j == ma.length - 1) {
						System.out.println("O número nums[" + i + "][" + j + "] é igual a " +ma[i][j]);
					}
				}
			}
	}

}

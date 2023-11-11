package Vetor_Matrizes;

import java.util.Scanner;

public class MatrizInserirNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		

		int[][] nums = new int[3][2];
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<2; j++) {
				System.out.print("Digite o num[" + i + "][" + j + "] : ");
				nums[i][j] = scn.nextInt();
			}
		}
		
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<2; j++) {
				System.out.println("O número nums [" + i + "][" + j + "] é igual a " +nums[i][j]);
			}
		}
		
		
		
	}

}

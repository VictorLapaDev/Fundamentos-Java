package Pacote_Lista_Dois;
import java.util.Scanner;
public class Classe_Troca {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		
		System.out.println("Digite o valor da variavel A");
		int A = scn.nextInt();
		
		System.out.println("Digite o valor de variavel B");
		int B = scn.nextInt();
		
		
		int C = A;
		A = B;
		B = C;
		
		
		System.out.println("O valor de A é " + A);
		System.out.print(" e o valor de B é " + B);
		

	}

}

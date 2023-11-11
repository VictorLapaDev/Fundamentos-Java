package Lista03Extras;

import java.util.Scanner;

public class exD_VictorLapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int num = 0;
		int media = 0;
		int soma = 0;
		int maior = 0;
		int menor = 0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("Digite um número: ");
			num = scn.nextInt();
			if(i==1) {
				maior = num;
				menor = num;
			}
			
			if(num>maior) {
				maior = num;
			}
			else if(num<menor) {
				menor = num;
			}
		
			soma += num;
		}
		
		media = soma / 5;
		System.out.println("Maior = "+maior);
		System.out.println("Menor = "+menor);
		System.out.println("Média = "+media);
		System.out.println("Soma = "+soma);
	}

}

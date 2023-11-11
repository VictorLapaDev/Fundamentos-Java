package Desafio;

import java.util.Scanner;

public class ValidarCPF {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	//loop
	char again = 's';
	while (again == 'S' || again == 's') {
		
	System.out.println("Digite um CPF para ver se ele é válido ou inválido:");
	String cpf = scn.next();
	
	// Remove todos caracteres
	 cpf = cpf.replaceAll("[^0-9]", "");
	 
	 // Define cada número
	 int num1 = Character.getNumericValue(cpf.charAt(0));
	 int num2 = Character.getNumericValue(cpf.charAt(1));
     int num3 = Character.getNumericValue(cpf.charAt(2));
     int num4 = Character.getNumericValue(cpf.charAt(3));
     int num5 = Character.getNumericValue(cpf.charAt(4));
     int num6 = Character.getNumericValue(cpf.charAt(5));
     int num7 = Character.getNumericValue(cpf.charAt(6));
     int num8 = Character.getNumericValue(cpf.charAt(7));
     int num9 = Character.getNumericValue(cpf.charAt(8));
     int num10 = Character.getNumericValue(cpf.charAt(9));
     int num11 = Character.getNumericValue(cpf.charAt(10));
	
	
    // Calcula o Primeiro digito
     	int t1 = ((num1*10+num2*9+num3*8+num4*7+num5*6+num6*5+num7*4+num8*3+num9*2)* 10) % 11;
     	int dig1 = 0;
     	
     	if(t1==10) {
		   dig1 = 0;
	  } else {
		   dig1 = t1;
	  }
     	
		// Calcula o Segundo digito
     	int t2 = ((num1*11+num2*10+num3*9+num4*8+num5*7+num6*6+num7*5+num8*4+num9*3+dig1*2)* 10) % 11;
     	int dig2 = 0;
     	
     	if(t2==10) {
    	  dig2 = 0;
     	}else {
    	  dig2 = t2;
     }
     
	//Valida o CPF
     	if(num1==num2 && num2==num3 && num3==num4 && num4==num5 && num5==num6 && num6==num7 && num7==num8 && num8==num9 && num9==num10 && num10==num11) {
     		System.out.println("O CPF é inválido!");
     	}else if(num10!=dig1) {
     		System.out.println("O CPF é inválido!");
     	}else if(num11!=dig2) {
     		System.out.println("O CPF é inválido!");
     	}else {
     		System.out.println("O CPF é válido!");
     	}
	
     	System.out.println("Deseja verificar outro CPF?    s/n");
     	scn.nextLine();
     	again = scn.next().charAt(0);
     	
		}
	System.out.println("\nObrigado por escolher nossa ajuda!  :)");
	}
}
	
	  

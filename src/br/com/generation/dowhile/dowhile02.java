package br.com.generation.dowhile;

import java.util.Scanner;

public class dowhile02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,soma=0.0;
		Scanner entrada= new Scanner(System.in);
		do {
			System.out.println("Digite um numero para soma e 0 para sair: ");
			a=entrada.nextDouble();
			soma+=a;
		}while(a!=0.0);
		System.out.println("A soma dos números é:" +soma);
		
		
	}

}

package br.com.generation.dowhile;

import java.util.Scanner;

public class dowhile03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		int  i=0;
		do {
			System.out.println("Digite o primeiro número: ");
			int numero1=entrada.nextInt();
					
			System.out.println("Digite o segundo número: ");
			int numero2=entrada.nextInt();
			
			if(numero2==0) {
				//break;
				System.out.println("Não é possivel dividir por 0");
				continue;
			}
			
			System.out.println((i+1)+"resultado"+numero1+" / "+numero2+"é: "+(numero1/numero2));
		}while(i<=10);
	}

}

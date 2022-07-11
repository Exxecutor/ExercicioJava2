package br.com.generation.lacowhile;

import java.util.Scanner;

public class while03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int numero=0;
		while(numero!=10) {
			System.out.println("Digite um número:");
			numero=in.nextInt();
			if(numero==10) {
				System.out.println("Você acertou");
			}
			if(numero!=10) {
				System.out.println("Você errou.......Digite novamente");
			}
		}
		
	}

}

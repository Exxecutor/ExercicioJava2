package br.com.generation.exerepet;

import java.util.Scanner;

public class exlacorepet5 {

	public static void main(String[] args) {
		/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
		 */
		float num,soma=0;
		Scanner entrada= new Scanner(System.in);
		do {
			System.out.println("Digite um número: ");
			num=entrada.nextFloat();
			soma=num+soma;
			
		}while(num!=0);
		System.out.println("A soma dos números digitados é:"+soma);
	}

}

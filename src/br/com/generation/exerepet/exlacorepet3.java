package br.com.generation.exerepet;

import java.util.Scanner;

public class exlacorepet3 {

	public static void main(String[] args) {
		/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
		 */
		int idade=0,menor=0,maior=0;
		while(idade!=-99) {
			Scanner entrada=new Scanner(System.in);
			System.out.println("Digite uma idade(Digite -99 para sair): ");
			idade=entrada.nextInt();
			if(idade<=21) {
				menor++;
			}
			if(idade>=50) {
				maior++;
			}
		}
		System.out.println("O número de menores de 21 foi: " +menor);
		System.out.println("O número de maiores de 50 foi: "+ maior);

	}

}

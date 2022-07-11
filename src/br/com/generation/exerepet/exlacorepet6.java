package br.com.generation.exerepet;

import java.util.Scanner;

public class exlacorepet6 {

	public static void main(String[] args) {
		/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
		 */
		int num,mult=0,quant=0,med;
		Scanner entrada= new Scanner(System.in);
		do {
			System.out.println("Digite um número(Digite 0 para sair): ");
			num=entrada.nextInt();
			if((num%3)==0 && num!=0) {
				quant++;
				mult=num+mult;
			}
		}while(num!=0);
		med=mult/quant;
		System.out.println("A média dos números multiplos de três é: "+med);
	}

}

package br.com.generation.exerepet;

public class exlacorepet2 {

	public static void main(String[] args) {
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		for(int num=1;num<=10;num++) {
			if((num%2)==0) {
				System.out.println("O "+num+" é par");
			}
			else {
				System.out.println("O "+ num+" é impar");
			}
		}
	}

}

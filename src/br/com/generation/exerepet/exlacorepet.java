package br.com.generation.exerepet;

public class exlacorepet {

	public static void main(String[] args) {
		/*
		 Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)
		 */
		for(int num=1000;num<=1999;num++) {
			if((num%11)==5) {
				System.out.println(num+"é o valor divisivel por 11 que o resto é 5");
			}
			else {
				continue;
			}
		}
		
	}

}

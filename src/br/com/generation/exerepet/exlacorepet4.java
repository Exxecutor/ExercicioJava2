package br.com.generation.exerepet;

import java.util.Scanner;

public class exlacorepet4 {

	public static void main(String[] args) {
		/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.
		 */
		int pessoa=0,idade=0,sexo=0,mental=0;
		int calma=0,mnerv=0,hagres=0,oucalm=0,nmaisquarenta=0,cmenosdezoito=0;
		Scanner entrada= new Scanner(System.in);
		while(pessoa<=150) {
			System.out.println("Digite a idade(Digite -1 para encerrar o programa): ");
			idade=entrada.nextInt();
			if(idade==(-1)) {
				break;
			}
			System.out.println("Digite o sexo(1-feminino / 2-masculino / 3-Outros): ");
			sexo=entrada.nextInt();
			System.out.println("Digite o estado da pessoa(1-se a pessoa era calma; 2-se a pessoa era nervosa e 3-se a pessoa era agressiva");
			mental=entrada.nextInt();
			if(mental==1) {
				calma++;
			}
			if(sexo==1 && mental==2) {
				mnerv++;
			}
			if(sexo==2 && mental==3) {
				hagres++;
			}
			if(sexo==3 && mental==1) {
				oucalm++;
			}
			if(idade>=40 && mental==2) {
				nmaisquarenta++;
			}
			if(idade<=18 && mental==1) {
				cmenosdezoito++;
			}
			pessoa++;
			
		}
		System.out.println("O numero de pessoas calmas é de "+calma+" pessoas");
		System.out.println("O numero de mulheres nervosas é de "+mnerv+" mulheres");
		System.out.println("O numero de homens agressivos é de "+hagres+" homens");
		System.out.println("O numero de outros calmos é de "+oucalm+" pessoas");
		System.out.println("O numero de maiores de 40 nervosos é de "+nmaisquarenta+" pessoas");
		System.out.println("O numero de menores de 18 calmos é de "+cmenosdezoito+" pessoas");
			
	}

}

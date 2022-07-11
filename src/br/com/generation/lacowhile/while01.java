package br.com.generation.lacowhile;

public class while01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int contador=0;
		
		while(contador<=7) {
		System.out.println(contador);
		contador++;
		Thread.sleep(1000);
		}
	}

}

package br.com.generation.lacofor;

public class lacofor03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int sobe=1,desce=9;sobe<=9 && desce>=0;sobe++,desce--) {
			System.out.println(sobe +" | "+desce);
			Thread.sleep(500);
		}
	}

}

package vetor;

import java.util.Scanner;
public class vetorAtv02 {

	public static void main(String[] args) {
		
		Scanner jc = new Scanner (System.in);
		
		int a[]=new int [6];
		int sm = 0;
		
		for (int i = 1; i < 6; i++) {
			System.out.print("Informe um número: ");
		a[i] = jc.nextInt();
		sm += a[i];
		}

		if (sm >= 30) {
			
			System.out.println("A soma de seus valores é: "+sm);
			
		}
		
		else {
			System.out.println("Seu valor é menor que 30");
		}
		
	}
	
	

}

package vetor;

import java.util.Scanner;

public class vetorAtv03 {

	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
		
		int a[] = new int [5];
		int b[] = new int [5];
		int c[] = new int [5];
		int sma = 0;
		int smb = 0;
		
		for (int i = 0; i <= 5; i++) {
			System.out.print("Informe um número para o vetor (a): ");
			a[i] = jc.nextInt();
			sma += a[1];
		}
		
		for (int i = 0; i <= 5; i++) {
			System.out.print("Informe um número para o vetor (b): ");
			a[i] = jc.nextInt();
			smb += b[i];
		}
		
		if (sma > smb) {
			System.out.println("V(a): "+sma);
			System.out.println("V(b): "+smb);	
		}
		
	}

}

package aulaUm;

import java.util.Scanner;

public class LocalizaNumero {

	public static void main(String[] args) {
		
		
		int vetor[] = {1,2,3,4,5,6,7,8,9,10};
		
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		boolean achou = false;
		
		for (int i=0; i<10; i++) {
			if (vetor[i] == 8){
				achou = true;
		    }
		
			if (achou) {
		        System.out.println("Achei");
		        System.out.printf("Na Posição %d está localizado do numero %d.", i, vetor[i]);	
		        break;
			}
		}
	}
}
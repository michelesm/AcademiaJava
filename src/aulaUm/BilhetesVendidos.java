package aulaUm;

import java.util.Scanner;

public class BilhetesVendidos {

	public static void main(String[] args) {

		double classeA = 50;
		double classeB = 30;
		double classeC = 20;
		double total = 0;
		int vendidos =0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de ingressos vendidos classe A: ");
		vendidos = sc.nextInt();
		classeA *= vendidos;
		
		System.out.println("Informe a quantidade de ingressos vendidos classe B: ");
		vendidos = sc.nextInt();
		classeB *= vendidos;
		
		System.out.println("Informe a quantidade de ingressos vendidos classe C: ");
		vendidos = sc.nextInt();
		classeC *= vendidos;
		
		total = classeA + classeB + classeC;
		
		System.out.printf("Total da receita: %.2f%n", total);
		
		sc.close();
	}

}

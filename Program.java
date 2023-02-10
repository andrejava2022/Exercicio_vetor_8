package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int e = sc.nextInt();
		double num[] = new double[e];
		double totalP = 0, somaP = 0;
		
		for(int i=0; i<e; i++) {
			System.out.print("Digite um numero: ");
			num[i] = sc.nextDouble();
			
			if(num[i]%2==0) {
				totalP++;
				somaP+=num[i];
			}
			
		}
		if(totalP>0) {
			double media = somaP/totalP;
			System.out.printf("MÉDIA DOS PARES = %.1f",media);	
		}else {
			System.out.println("NENHUM NÚMERO PAR");
		}
			
	}

}

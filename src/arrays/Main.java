package arrays;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	

		int[] vetor2 = new int[5];
		
		Double [] vetor3 = new Double [4];
		
		vetor3 [0] = 25.0;
		vetor3 [1] = 9.0;
		vetor3 [2] = 5.5;
		vetor3 [3] = 6.7;

		String[] vetor = { "Robson", "Adams", "Thaís", "Eduarda" };

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Nome: " + vetor[i] + " Posição: " + i);
		}

		for (int i = 0; i < vetor2.length; i++) {
			System.out.println("Digite algo " + (1 + i) + " : ");
			vetor2[i] = scan.nextInt();
		}

		for (int vet : vetor2) {
			System.out.println("-----------------------------");
			System.out.println(vet);
		}
		
		for(double vet3 : vetor3) {
			System.out.println(vet3);
		}

	}

}

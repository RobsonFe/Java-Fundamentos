package arrays;

import java.util.Arrays;

public class Exercicios {

	public static void main(String[] args) {
		
		int [] num = new int [3];
		
		num[0] = 20;
		num[1] = 40;
		num[2] = 19;
		
		System.out.println(Arrays.toString(num));
		
		String [] nomes = new String [4];
		
		nomes[0] = "Robson";
		nomes[1] = "Thaís";
		nomes[2] = "Adams";
		nomes[3] = "Eduarda";
		
		System.out.println(Arrays.toString(nomes));
		System.out.println("Nome: " + nomes[0]);

	}

}

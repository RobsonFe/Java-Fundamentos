package strings;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("Olá Java!");
		System.out.println("Olá Java!".codePointCount(2, 4));
		
		String a = "Olá Java";
		System.out.println(a.charAt(0));
		
		String b = "Robson";
		
		System.out.println(b.length());
		
		var nome = "Robson";
		var valorInt = 15;
		var valorDouble = 24.33647;
		
		System.out.println(nome);
		
		System.out.printf("%s \n", nome);
		System.out.printf("%d \n", valorInt);
		System.out.printf("%.2f", valorDouble);
		
	}

}

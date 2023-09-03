package Collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoHashSet_Baguncado {

	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		// Os tipos Collections fazem a leitura apenas de tipos primitivos 
		
		// Mas como fazem a leitura desses tipos se não estão no tipo primitivo ?
		
		// Porque é feita uma conversão por baixo do codigo na hora da declarar a variavel.
		
		conjunto.add("Robson"); // String
		conjunto.add(2.9); // double -> (Double)
		conjunto.add(true);// boolean -> (Boolean)
		conjunto.add('x'); 
		conjunto.add(1);
		conjunto.add(2);
		
		System.out.println(conjunto);
		System.out.println("O tamanho do conjunto é " + conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains("robson"));
		
		conjunto.remove(2.9); // Remove o elemento do conjunto.
		
		System.out.println(conjunto);
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(false);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums); // Ele une os dois conjuntos.
		System.out.println(conjunto);
		
		conjunto.retainAll(nums); //  Só passa os valores que são igual do outro conjunto.
		
		System.out.println(conjunto);
		
		conjunto.clear(); // limpa todos os dados
		
		System.out.println(conjunto);
		
		
	}

}

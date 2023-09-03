package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoHashSet_Organizado {

	public static void main(String[] args) {
		Set <String> lista = new HashSet<String>();
		SortedSet<String> lista1 = new TreeSet(); // Lista dados de forma ordenada
		
		lista.add("Robson");
		lista.add("Adams");
		lista.add("Thaís");
		lista.add("Eduarda");
		
		for(String listas:lista) {
			System.out.println(listas);
		}
		
		HashSet<Integer> numero = new HashSet();
		
		numero.add(1);
		numero.add(2);
		numero.add(3);
		numero.add(4);
		
		for(int numeros: numero) {
			System.out.println(numeros);
		}
		
		System.out.println(lista);
		System.out.println(numero);

	}

}

package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		// add e offer tem a mesma função de adicionar elementos na fila
		// A diferenção está no comportamento quando a fila está cheia.
		// add retorna um valor null, já offer lança uma exepction.
		
		fila.add("Robson");
		fila.offer("Adams");
		fila.add("Thaís");
		fila.offer("Eduarda");
		
		// Ambos retornam o primeiro elemento da fila
		// a Diferença está no comportamento quando a fila está vazia.
		
		System.out.println(fila.peek()); // retorna o primeiro elemento da fila
		System.out.println(fila.poll()); // retorna o primeiro elemento da fila e remove
		System.out.println(fila.element()); // retorna o primeiro elemento da fila igual o peek, só que lança uma exepction.
		System.out.println(fila.contains(fila)); // retorna um valor booleano se contem um elemento especifico da fila.
		
		fila.size(); // retorna o tamanho total da fila.
		fila.clear(); // Limpa os elementos da fila.
		fila.isEmpty(); // Pode ser usado como condicional para verificar se a lista está vazia.
		
	}

}

package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		//Piliha tem o comportamento do primeiro que entra é o ultimo que sai.
		
		livros.add("O Hobbit");
		livros.push("A Sociedade do Anel"); // Adiciona um elemento na lista, mas se ultrapassar a capacidade, lança uma exepction.
		livros.push("As Duas Torres");
		livros.push("O Retorno do Rei");
		livros.push("O Silmarilion");
		
		// De resto, utiliza as mesmas funções das filas.
		
		System.out.println(livros.size());
		
		System.out.println(livros.pop()); // Mostra o ultimo elemento e remove
		System.out.println(livros.poll()); // Mostra o ultimo elemento e remove
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		// Entendendo as funções
		
		// Pop(); é utilizado como LIFO( Last in, First Out) 
		// O ultimo que entra é o primeiro que sai.
		
		//Poll(); é utilizado como FIFO (First in, First Out)
		// O primeiro que entra é o primeiro que sai.
		
		
		
		
	}

}

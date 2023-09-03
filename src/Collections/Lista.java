package Collections;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList(); //Voce pode tirar o ArrayList no começo e deixar apenas List 
		
		Usuario u1 = new Usuario ("Robson");
		
		lista.add(u1);
		lista.add(new Usuario("Beatriz"));
		lista.add(new Usuario("Anderson"));
		lista.add(new Usuario("Miguel"));
		lista.add(new Usuario("Joanna"));
		lista.add(new Usuario("Carla"));
		
		System.out.println(lista);
		System.out.println(lista.size());
		
		System.out.println(lista.get(3)); // Acessa os dados pelo indice.
		
		System.out.println(lista.remove(new Usuario("Anderson"))); // Remove o usuario digitando o dado.
		
		System.out.println("Encontra esse usuario? " + lista.contains(new Usuario ("Joanna"))); // Pesquisando usuario na lista.
		
		for(Usuario u: lista) {
			System.out.println(u.nome); // ForEach para encontrar todos os usuarios.
		}
		
		
		


	}

}

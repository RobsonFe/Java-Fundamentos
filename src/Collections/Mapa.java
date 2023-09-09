package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		//O Map trabalha com Chave/Valor.
		// Exemplo: Id e Nome.
		
		Map<Integer, String> usuarios = new HashMap();
		
		// É ultilizado o nome "put" por colocar e sobrescrever metodos.
		// Não tem metodos de adicionar como "add".
		
		usuarios.put(1, "Robson");
		usuarios.put(2, "Adams");
		usuarios.put(3, "Helder");
		usuarios.put(4, "Marcio");
		usuarios.put(5, "Didi");
		
		System.out.println(usuarios.size()); // retorna o total da lista.
		System.out.println(usuarios.isEmpty()); // verifica se está vazio.
		
		System.out.println(usuarios.keySet()); // busca todas as chaves.
		System.out.println(usuarios.values()); // busca todos os valores.
		System.out.println(usuarios.entrySet()); // busca chave e valor.
		
		System.out.println(usuarios.containsKey(4)); // verifica se possui essa chave.
		System.out.println(usuarios.containsValue("Didi")); // verifica se possui esse valor.
		
		System.out.println(usuarios.get(3)); // Busca o que tem na chave 3.
//		System.out.println(usuarios.remove(2)); // Remove a chave em especifco.
		
		// ForEach para pecorrer todas as chaves.
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		//ForEach para pecorrer todos os valores.
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		//ForEach para pecorrer ambos chaves e valores.
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
				System.out.print(registro.getKey() + " ");
				System.out.println(registro.getValue());
		}
	}

}

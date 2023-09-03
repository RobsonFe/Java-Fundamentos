package Collections;

public class Equals {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Robson","09826374830", 29);
		Pessoa p2 = new Pessoa("Robson","09826374830", 29);
		
		String nome = "Robson";
		String nome1 = "Robson";
		
		System.out.println(nome == nome1);
		System.out.println(nome.equals(nome1));
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.nome.equals(p2.nome));
		

	}

}

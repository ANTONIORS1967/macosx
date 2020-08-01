package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		SortedSet<String> listaAprovado =new TreeSet<String>();
		listaAprovado.add("Ana");
		listaAprovado.add("Carlos");
		listaAprovado.add("Luca");
		listaAprovado.add("Pedro");
		
		for(String candidato:listaAprovado) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums =new HashSet<>();
		nums.add(1);
		nums.add(3);
		nums.add(120);
		nums.add(300);
		
		for(int n : nums) {
			System.out.println(n);
		}
	}

}

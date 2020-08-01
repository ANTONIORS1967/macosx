package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> adiciona elemento na fila
		//Diferen�a � o comportamento quando a fila est� cheia!
		fila.add("Ana");//retirba false
		fila.offer("Bia");//Lan�a uma exce��o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafael");
		fila.offer("Gui");
		
		//Peek e Element -> obter oproximo elemento
		//da fila (sem remover)
		
		//Diferen�a � o comportamento ocorre
		//quando a fila est� vazia.
		
		System.out.println(fila.peek());//retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element());//Lan�a uma exce��o
		System.out.println(fila.element());
		
		//Poll e Remove -> obter o proximo elemento
		//da fila e remove.
		
		//Diferen�a � o comportamento ocorre
		//quando a fila est� vazia.		
		System.out.println(fila.poll());//retorna null
		System.out.println(fila.remove());//Lan�a uma exce��o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		
//		fila.size();
//		fila.clear();
//		fila.isEmpty();
//		fila.contains(...);
	}

}

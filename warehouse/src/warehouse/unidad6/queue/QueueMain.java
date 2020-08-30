package warehouse.unidad6.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMain {
	public static void main(String[] args) {
		// add - Agregar un elemento al final de la cola
		// poll - Recupera el primero elemento y lo elimina
		// peek - Recupera el primer elemento y lo conserva
		
		Queue<String> queue1 = new PriorityQueue<>();
		queue1.add("1");
		queue1.add("2");
		queue1.add("3");
		queue1.add("4");
		queue1.add("5");
		// 1, 2, 3, 4, 5
		
		String poll = queue1.poll();
		System.out.println("poll = " + poll);
		System.out.println("size = " + queue1.size());
		
		String peek = queue1.peek();
		System.out.println("peek = " + peek);
		System.out.println("size = " + queue1.size());
		
		System.out.println("empty = " + queue1.isEmpty());
		

		
		
	}
}

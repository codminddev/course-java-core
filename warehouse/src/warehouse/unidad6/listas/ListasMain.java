package warehouse.unidad6.listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListasMain {
	public static void main(String[] args) {
		
		//ArrayList list1 = new ArrayList();
		List list1 = new ArrayList();
		list1.add("Hola mundo"); 
		list1.add(1); // list1.add( Integer.valueOf(1) );
		list1.add(new Object());
		list1.add(new ListasMain());
		
		List<String> lista2 = new ArrayList<>(); 
		lista2.add("Hola");
		lista2.add("Mundo");
		lista2.add("Desde");
		lista2.add("El");
		lista2.add("Curso");
		lista2.add("De");
		lista2.add("Java Core");
		lista2.add("Java Core");
		lista2.add(null);
		
		for( String str : lista2 ) {
			System.out.println(str);
		}
		
		System.out.println("------------");
		
		lista2.remove("Curso");
		
		for( String str : lista2 ) {
			System.out.println(str);
		}
		
		System.out.println("2 valor => " + lista2.get(1));
		
		System.out.println("contains => " + lista2.contains("Software"));
		
		lista2.stream().forEach(line -> System.out.println(line));
		
		//LinkedList
		
		List<String> lista3 = new LinkedList<String>();
	}
}

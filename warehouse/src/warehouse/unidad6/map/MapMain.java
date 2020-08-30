package warehouse.unidad6.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapMain {
	public static void main(String[] args) {
		
		Map<Long, String> map1 = new HashMap<>();
		map1.put(1L, "Oscar Blancarte"); // 1 = Oscar Blancarte
		map1.put(2L, "Juan Perez"); 	 // 2 = Juan Perez
		map1.put(3L, "Oscar Blancarte"); // 3 = Oscar Blancarte
		map1.put(1L, "Alfredo Lopez");	 // 1 = Alfredo Lopez
		
		for( Entry<Long, String> value : map1.entrySet()) {
			System.out.println("Key = " + value.getKey() + " value = " + value.getValue());
		}
		
		map1.remove(1L);
		
		System.out.println("-----------------");
		
		for( Entry<Long, String> value : map1.entrySet()) {
			System.out.println("Key = " + value.getKey() + " value = " + value.getValue());
		}
		
		System.out.println("exist key => " + map1.containsKey(2L));
		System.out.println("exist value => " + map1.containsValue("Juan Perez 2"));
		
		
		String value2 = map1.get(2L);
		System.out.println("value2 => " + value2);
		
		
		
		
	}
}

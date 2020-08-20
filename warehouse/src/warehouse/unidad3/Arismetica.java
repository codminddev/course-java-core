package warehouse.unidad3;

public class Arismetica {
	public static void main(String[] args) {
		/*
			+
			-
			*
			/
			%
			++
			--
		 */
		
		double a = 10;
		double b = 6;
		double c = 20;
		double d = 30;
		System.out.println("a = 10");
		System.out.println("a = 5");
		
		System.out.println("a + b = " +  (a + b)  );
		System.out.println("a - b = " +  (a - b)  );
		System.out.println("a * b = " +  (a * b)  );
		System.out.println("a / b = " +  (a / b)  );
		
		System.out.println("a % b = " +  (a % b)  );
		
		System.out.println("a++ = " +  ( a++ )  ); // a = a + 1;
		System.out.println("a = " + a);
		
		System.out.println("++b = " +  ( ++b )  ); // a = a + 1;
		System.out.println("b = " + b);
		
		System.out.println("c-- = " + (c--));
		System.out.println("c = " + c);
		
		System.out.println("--d = " + (--d));
		System.out.println("d = " + d);
		
	}
}

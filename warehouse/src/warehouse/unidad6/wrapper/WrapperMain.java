package warehouse.unidad6.wrapper;

public class WrapperMain {
	public static void main(String[] args) {
		// int, long, float, double, byte, char
		
		Integer num1 = 1; //Integer.valueOf(1);
		Integer num2 = new Integer(1);
		Integer num3 = new Integer("1");
		Integer num4 = Integer.valueOf(1);
		Integer num5 = Integer.valueOf("1");
		
		int num6 = num2;
		
		System.out.println(num6);
		
		
		Long long1 = 1L;
		Long long2 = Long.valueOf("2");
		System.out.println(long2);
		
		Float float1 = 1.0F;
		Float float2 = Float.valueOf(2.2F);
		System.out.println(float2);
		
		Double double1 = 2.0;
		Double double2 = Double.valueOf(2.23);
		
		Byte byte1 = 1;
		Byte byte2 = Byte.valueOf( (byte) 1);
		
		Character char1 = 1;
		Character.valueOf( 'B' );
		
		
		String string1 = "hola"; // new String("hola");
		
	}
}

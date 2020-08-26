package warehouse.unidad6.array;

public class ArrayMain {
	public static void main(String[] args) {
		
		int uno = 1;
		int dos = 2;
		int tres = 3;
		
		int[] numeros = new int[10];
		numeros = new int[100];
		
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;		
		numeros[5] = 6;
		numeros[6] = 50;
		numeros[7] = 8;
		numeros[8] = 9;
		numeros[9] = 10;
		
		
		System.out.println("numeros.length " + numeros.length);
		
		int num1 = numeros[0];
		int last = numeros[numeros.length - 1];
		
		System.out.println("num1 => " + num1);
		System.out.println("last => " + last);
		
		for(int c = 0; c < numeros.length; c++) {
			System.out.println(numeros[c]);
			if(numeros[c] == 50) {
				System.out.println("Encontré el número 50");
				break;
			}
		}
		
		int a = numeros[-1];
		
	}
}

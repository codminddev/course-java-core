package warehouse.unidad6.stack;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		Stack<String> stack1 = new Stack<>();
		stack1.push("0");
		stack1.push("1"); 
		stack1.push("2");
		stack1.push("3");
		stack1.push("4");
		stack1.push("5");
		stack1.push("6");
		
		// 5, 4, 3, 2, 1
		
		String last = stack1.peek();
		System.out.println("Last = " + last);
		System.out.println("Size = " + stack1.size());
		
		String pop = stack1.pop();
		System.out.println("pop = " + pop);
		System.out.println("size = " + stack1.size());
		
		System.out.println("Empty = " + stack1.isEmpty());
		System.out.println("Search = " + stack1.search("7"));
		
		
	}
}

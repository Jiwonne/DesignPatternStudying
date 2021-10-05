package InnerClass;

import java.util.Scanner;
public class OuterClass {
	Scanner userInput = new Scanner(System.in);
	
	private int value = 0;
	
	/*
	 * The benefit of Inner class is it doesn't have to reference Outer class's object
	 * It can reduce totall code.
	 */
	class InnerClass {
		int calculate() {
			System.out.print("Enter a number: ");
			value = userInput.nextInt();
			return value;
		}
	}
	

}

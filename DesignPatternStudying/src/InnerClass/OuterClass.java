package InnerClass;

import java.util.Scanner;
public class OuterClass {
	Scanner userInput = new Scanner(System.in);
	
	private int value = 0;
	
	class InnerClass {
		int calculate() {
			System.out.print("Enter a number: ");
			value = userInput.nextInt();
			return value;
		}
	}
	

}

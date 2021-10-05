package DesignPattern;

/*
 * making a class with final is a way for a singleton
 */
final public class SingleTonPractice {
	
	/*
	 * The purpose of SingleTon is to create only one instance in the program lifetime.
	 * How > To make a constructor private and static intance (Control over access to the unique instance.)
	 */
	
	private static SingleTonPractice staticVariable;
	
	private SingleTonPractice() {}
	
	public static SingleTonPractice getInstance() {
		return staticVariable;
	
	}

}

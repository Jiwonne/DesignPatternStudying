package AnonymousInnerClass;

public class AnonymousInner {

	public static void main(String[] args) {
		
		/*
		 * Call printer objects with Printable Interface
		 * Create an anonymous class
		 */
		
//		Printable printable = new Printable() {
//
//			/*
//			 * For Interface, @Override annotation is not needed.
//			 */
//			public void print(String message) {
//				// TODO Auto-generated method stub
//				
//			};
//		};
		/*
		 * lambda expression
		 */
		String greetingMessage = "Hello, Jiwon";

		Printable printable = (message) -> System.out.println("Your message is " + message);
	
		printable.print(greetingMessage);
	}

}

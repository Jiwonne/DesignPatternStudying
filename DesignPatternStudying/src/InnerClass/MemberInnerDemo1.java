package InnerClass;

public class MemberInnerDemo1 {

	public static void main(String[] args) {
		/*
		 * Creating an instance of OuterClass before instantiating InnerClass
		 */
		OuterClass outer = new OuterClass();
		
		/*
		 * This is the way of instantiating an inner class object
		 */
		OuterClass.InnerClass inner = outer.new InnerClass();
		System.out.println(inner.calculate());

	}

}

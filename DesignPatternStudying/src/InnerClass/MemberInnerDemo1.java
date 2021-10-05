package InnerClass;

public class MemberInnerDemo1 {

	public static void main(String[] args) {
		/*
		 * Creating an instance of OuterClass before instantiating InnerClass
		 */
		OuterClass outer = new OuterClass();
		
		OuterClass.InnerClass inner = outer.new InnerClass();
		System.out.println(inner.calculate());

	}

}

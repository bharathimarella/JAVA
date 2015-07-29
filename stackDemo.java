import java.util.Stack;

public class stackDemo {
	public static void main(String[] args){
		Stack<String> s=new Stack<String>();
		s.push("1");
		s.push("2");
		s.push("A");
		s.push("B");
		System.out.println("First element in stack is  "+s.peek());
		System.out.println("Elements in stack are =  "+s);
		System.out.println("Offest of A is  "+s.search("A"));
		System.out.println("Offest of 2 is  "+s.search(2));
		System.out.println("Offset of Z is  "+s.search("z"));
		s.pop();
		s.pop();
		
		System.out.println("Elements in stack after pop are =  "+s);
		System.out.println("Offest of A is  "+s.search("A"));
		System.out.println("Offest of 2 is  "+s.search(2));
		System.out.println("Offest of B is  "+s.search("B"));
		System.out.println("Offest of Z is  "+s.search("z"));
		System.out.println("Is Stack Empty ? "+s.empty());
		
		
	}

}

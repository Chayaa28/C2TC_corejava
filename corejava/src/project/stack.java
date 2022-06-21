package project;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack<String>stack = new stack<String>();
		stack.push("hi");
		stack.push("hello");
		stack.push("bye");
		stack.push("gm");
		iterator<String>iterator = stack_iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		stack.pop();
		iterator = stack.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}



	}

}

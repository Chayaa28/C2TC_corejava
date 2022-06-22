package project;
import java.util.*;
public class Vectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <String>Stack = new Stack<String>();
	      Stack.push("JAVA");
	      Stack.push("CORE JAVA");
	      Stack.push("ADVANCE JAVA");
	      Stack.push("J2EE");
	      System.out.println(Stack);
	      
	      System.out.println(Stack.peek());
	      System.out.println(Stack);
	      
	      System.out.println(Stack.empty());
	      System.out.println(Stack);
	      
	      System.out.println(Stack.pop());
	      System.out.println(Stack);
	      
	      Iterator<String>itr=Stack.iterator();
	      while(itr.hasNext()) 
	      {
	    	  System.out.println(itr.next());
	      }
	      System.out.println(Stack.search("ADVANCE JAVA"));
	      System.out.println(Stack);
	      
		}
		
}

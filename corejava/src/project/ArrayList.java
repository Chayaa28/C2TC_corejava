package project;

import java.util.List;

public class ArrayList {
public static void main(String[]arg)
{
	//creates an ArrayList object with an initial capacity of 10.
	List<String>list=new
			ArrayList<String>();
	//call add() method to add elements of the end of the list using the reference variable list.
	System.out.println("Adding elements to end of list");
	list.add("J");//Adding elements of index 0;
	list.add("A");//Adding elements of index 1;
	list.add("V");//Adding elements of index 2;
	System.out.println("ArrayList insertion order;"+list);
	System.out.println("Adding an element at a specific index after V element");
	list.add(3,"A");
	System.out.println("ArrayList insertion order after adding A;"+list);
}
	
}

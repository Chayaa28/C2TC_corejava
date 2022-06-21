package project;
import java.util.HashSet;
public class HashSetExample {

	public static void main(String[] args) {
//Creating HashSet object
		HashSet<String> set = new HashSet<String>();
		//Adding elements to HashSet
		set.add("JAVA");
		set.add("JSP");
		set.add("STRUCT");
		set.add("HIBERNATE");
		set.add("JSP");
		set.add("JAVA");
		//Printing the elements of HashSET
		System.out.println(set);//Output:(STRUCTS,HIBERNATE,JSP,JAVA
		//You can notice that duplicate elements are not added to HashSet
	}

}

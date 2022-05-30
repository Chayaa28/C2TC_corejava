package studentsc;
import java.util.Scanner;

public class studentsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
        System.out.println("enter the name of the student");
        String n= sc.nextLine();
        System.out.println("enter the marks of the student");
        float m = sc.nextFloat();
        System.out.println("enter the ID of the student");
        int o = sc.nextInt();
        System.out.println("enter the character");
        char c = sc.next().charAt(0);
        System.out.println("enter the name of the student"+n);
        System.out.println("enter the marks of the student"+m);
        System.out.println("enter the ID of the student"+o);
        System.out.println("character is");
	}

}

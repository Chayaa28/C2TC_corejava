package project;

public class WithoutException {

	public static void main(String[] args) {
		int d=0,a;
		try {
		    a=42/d;
		System.out.println("will not be printed");
		// TODO Auto-generated method stub

	}catch(ArithmeticException e) {
		System.out.println("Division by zero,");
	}
System.out.println("this will get printed");
	}
}

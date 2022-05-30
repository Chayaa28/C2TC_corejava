package studentsc;

public class StaticmethodExample {
	//static variable
	static int j = 100;
	//instance variable		
    int n = 200;
    //static method
    static void a()
    {
		int a = 200;
		System.out.println("print from a");
		// Cannot make a static reference to the no static fied b
	System.out.println("super.j");
    }
    void a2()
    {
    	System.out.println("inside 2a");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    StaticmethodExample ob1=new StaticmethodExample();
    ob1.a2();
    StaticmethodExample.a();
	}

}

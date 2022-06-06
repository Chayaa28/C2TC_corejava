package studentsc;
class A
{
   void run();
   {
   }
}

public class demo extends A  {
	final int speedlimit=90;
	void run() {
		speedlimit=400;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 obj=new Demo2();
		obj.run();

	}

}

package corejava_package;
abstract class atm
{
	abstract void withdraw();
}

public class Day1_P3 extends atm {
	void withdraw()
	{
		System.out.println("withdrawn successfully");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day1_P3 ob1=new Day1_P3();
		ob1.withdraw();

	}

}

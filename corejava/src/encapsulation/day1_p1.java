package encapsulation;

public class day1_p1 {
	
		int Year_of_pur;
		String make;
		int model;
		double cost;
		public void disp1()
		{
			System.out.println("year of purchase"+2001);
			System.out.println("make"+"suzuki");
		}
		public void disp2()
		{
			System.out.println("model"+1909);
			System.out.println("cost"+250000.0);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			day1_p1 ob=new day1_p1();
			day1_p1 ob1=new day1_p1();
			ob.disp1();
			ob1.disp2();

		}

	}
	
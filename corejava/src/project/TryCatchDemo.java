package project;

public class TryCatchDemo {
     String str = null;
     try {
    	 str.equals("Hello");
     }catch(NullPointerException ne) {
    	 str=new String("Hello");
    	 System.out.println(str.equals("Hello"));
     }
     System.out.println("Continuing in the program");
		// TODO Auto-generated method stub
     public static void main(String[] args) 

	}

}

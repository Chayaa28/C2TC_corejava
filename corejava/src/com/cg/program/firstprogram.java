package com.cg.program;

public class firstprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t=Thread.currentThread();
System.out.println(t);
System.out.println("the Answer is "+t.getName());
t.setName("James Gosling");
System.out.println("JAVA was Invented by="+t.getName());
	}

}

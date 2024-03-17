package com.corejava.first.test.constructor;

public class ConstructerExample {
		
				     int a;
				     int b;
				     ConstructerExample(){
				    	 System.out.println("Default constructer is called....");
				     }
				     
				     ConstructerExample(int a,int b)
				      {
				       this.a=a;
				       this.b=b;
				       System.out.println("Paramitarized constructer is called");
				      }
				     int sum()
				     {
				      return a+b;
				     }
				   public static void main(String args[])
				   {
					   ConstructerExample c1 = new ConstructerExample();
					   System.out.println(c1.sum());
					   ConstructerExample c2 = new ConstructerExample(10,20);
					   System.out.println(c2.sum());
				   }
	}



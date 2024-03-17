package com.corejava.first.test.MethodOverridding;

 
	public class MethodOverloading {

		void m1(int a)
		{
			System.out.println(" value of a "+a);
		}
		void m1(int a, int b)
		{
			System.out.println("Here two parameters are used...");
			System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
		}
		void m1(int a, float b)
		{
			System.out.println("Here two parameters are used...");
			System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
		}
		 public static void main(String args[]) {
			 MethodOverloading obj=new MethodOverloading();
			 obj.m1(5);
			 obj.m1(05,10);
			 obj.m1(15,1.05f);
		}

	}


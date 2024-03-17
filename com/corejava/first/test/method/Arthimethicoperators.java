package com.corejava.first.test.method;

public class Arthimethicoperators {

	public static void main(String[] args) {
		
		 int a=10,b=5;
		 Arthimethicoperators obj=new Arthimethicoperators();
		obj.m1(a,b);
		obj.m2(a,b);
		obj.m3(a,b);
		obj.m4(a,b);
		obj.m5(a,b);

		}


		void m1(int a,int b)
		{
			System.out.println(a+b);
		}
		void m2(int a,int b)
		{
		System.out.println(a-b);
		}
		void m3(int a,int b)
		{
		System.out.println(a*b);
		}
		void m4(int a,int b)
		{
		System.out.println(a%b);
		}
		void m5(int a,int b)
		{
		System.out.println(a/b);
		}

	}



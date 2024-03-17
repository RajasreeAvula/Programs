package fortest;

import java.util.Scanner;

import com.corejava.first.test.programs.Square;

public class Main{
	static Scanner sc=new Scanner(System.in);
	static Fibbonaciseries fib=new Fibbonaciseries();
	static PrimeNnum prime=new PrimeNnum();
	static Swappingnum swap=new Swappingnum();
	static Naturalnumbers naturalnum=new Naturalnumbers();
	static Square sq=new Square();
	
	
	
	static void primary() {
System.out.println("1 : Fibbonaciseries");
System.out.println("2 : PrimeNnum");
System.out.println("3 :Swappingnum");
System.out.println("4 :Naturalnumbers");
System.out.println("5 :Square");
System.out.println("please enter u r choice");
 int n=sc.nextInt();
 System.out.println("please enter ur input");
    code(n);
		}
	static void code(int n) {
		if(n==1) {
			int num=sc.nextInt(); 
			
		     fib.fibbonacci(num);
				}
		else
			if(n==2)
			{
				int num = sc.nextInt();
				if(!prime.isPrime(num))
				{
					System.out.println(num+" is a prime");
				}
				else
					System.out.println(num+" is not a prime");
				
			
			}
			else {
				if(n==3)
				{
					int a = sc.nextInt();
					int b = sc.nextInt();
					swap.swaping(a, b);
				}
				else
					if(n==4) {
						int num=sc.nextInt();
						naturalnum.natnum(num);
					}
					else
						if(n==5) {
						int num=sc.nextInt();
						sq.square(num);
						}
				
			}
		System.out.println("please enter 'c' for continue and 'e' for exit");
		char c = sc.next().charAt(0);
		if(c=='c')
			primary();
		else
			System.out.println("program ended");
	}
	
	
	
	

}

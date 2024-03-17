package Task1;

import java.util.Scanner;

import com.corejava.first.test.programs.Square;

import fortest.Fibbonaciseries;
import fortest.Naturalnumbers;
import fortest.PrimeNnum;
import fortest.Swappingnum;

public class Switch {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		Fibbonaciseries fib=new Fibbonaciseries();
		 PrimeNnum prime=new PrimeNnum();
		 Swappingnum swap=new Swappingnum();
		 Naturalnumbers naturalnum=new Naturalnumbers();
		 Square sq=new Square();
		
		
			System.out.println("1 : Fibbonaciseries");
			System.out.println("2 : PrimeNnum");
			System.out.println("3 :Swappingnum");
			System.out.println("4 :Naturalnumbers");
			System.out.println("5 :Square");
			System.out.println("please enter u r choice");
			 int n=sc.nextInt();
			 System.out.println("please enter ur input");
			    
            switch(n) {
            case 1:{
            	int num=sc.nextInt(); 
    			
   		     fib.fibbonacci(num);
            }
            case 2:{
            	int num = sc.nextInt();
				if(!prime.isPrime(num))
				{
					System.out.println(num+" is a prime");
				}
				else
					System.out.println(num+" is not a prime");
				 }
            case 3:{
            	int a = sc.nextInt();
				int b = sc.nextInt();
				swap.swaping(a, b);
            }
            case 4:{
            	int num=sc.nextInt();
				naturalnum.natnum(num);
            }
            case 5:{
            	int num=sc.nextInt();
				sq.square(num);
            }
            
            default:
            	
            
	}
}
}

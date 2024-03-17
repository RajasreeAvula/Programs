package fortest;

public class Fibbonaciseries {

	
		public void fibbonacci(int num) {
		int a=0;
		int b=1;
		int fib;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for( int i=0;i<=num;i++) {
		fib=a+b;
		System.out.print(fib+" ");
		a=b;
		b=fib;
		
		
		}
		
		
	}
}


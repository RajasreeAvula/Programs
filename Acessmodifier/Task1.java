package Acessmodifier;

public class Task1 {


		private int a=10;
		protected int b=32;
		public int c=20;
		int d=30;
		
		private void m1() {
		  int c=a+b;
		  System.out.println(c);
		}
      protected void m2() {
		int e=c+d;
		System.out.println(e);
	}

		public void m3() {
		  int c=a+b;
		  System.out.println(c);
		}
		  
	     void m4() {
	    	 int c=a*b;
	    	 System.out.println(c);
	     }
		
      
       public static void main(String[] args) {
Task1 obj=new Task1();
    	   
    	obj.m1();   
    	   
       }
       
}

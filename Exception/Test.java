package Exception;

public class Test   {

	void div(int a,int b)throws ArithmeticException{
	if(b==0) {	
		throw new ArithmeticException();	
	}
	else {
		int c=a/b;
		System.out.println(c);	
	}
	
	}
}


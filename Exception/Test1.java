package Exception;

public class Test1 {

	public static void main(String[] args) {
		Test t=new Test();
		try {
			t.div(10, 0);
		}
		catch(Exception e)
		{
			System.out.println("the value of b is Zero");
		}

	}

}

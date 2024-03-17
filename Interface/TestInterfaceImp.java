package Interface;

public class TestInterfaceImp implements TestInterface {

	@Override
	public int m2() {
		int a=20;
		System.out.println("hii");
		return a;
	}

	@Override
	public int m2(int a, int b) {
		int c=a+b;
		System.out.println("hloo");
		System.out.println(c);
		return c;
	}

	@Override
	public float m2(float a, float b) {
	   float c=a+b;
		return c;
	}

	
	
	
	
}

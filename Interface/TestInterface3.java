package Interface;

public class TestInterface3 {

	public static void main(String[] args) {
		
		
		TestInterfaceImp obj=new TestInterfaceImp();
		
		obj.m2();
		int result=obj.m2();
		int result1=obj.m2( 10, 20);
        float result2=obj.m2(0.2f,0.5f);
	}

}

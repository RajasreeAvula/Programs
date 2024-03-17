package fortest;

public class PrimeNnum {
//	public static void main(String[] args) {
//		int n=Integer.parseInt(args[0]);
//		boolean flag=false;
//		for(int i=2;i<=n/2;i++)
//			if(n%i==0){
//		{	
//			flag=true;
//			break;
//		}
//		}
//          if(!flag)
//	System.out.println(n +"is a prime num");
//          else
//          System.out.println(n +"is not a prime num");
//}
	public boolean isPrime(int num)
	{
		boolean flag=false;
		for(int i=2;i<=num/2;i++)
			if(num%i==0){
		{	
			flag=true;
			break;
		}
		}
		return flag;
	}

}

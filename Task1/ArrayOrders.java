package Task1;

import java.util.Scanner;

public class ArrayOrders {

	public static void main(String[] args) {
		Arraydescending obj = new Arraydescending();
		Scanner sc = new Scanner(System.in);
		int a[]= {2,5,3,7,1,8};
		System.out.println("1.ascending order");
		System.out.println("2.decending order");
		System.out.println("Enter  ur choice");
		int n=sc.nextInt();
		if(n==1)
		{
			int[] result=obj.acendingOrder(a);
			for(int i=0;i<result.length;i++)
				System.out.print(result[i]+" ");
		}
		else {
			int[] result=obj.decendingOrder(a);
			for(int i=0;i<result.length;i++)
				System.out.print(result[i]+" ");
		}

	}

}

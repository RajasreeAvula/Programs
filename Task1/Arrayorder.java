package Task1;

import java.util.Scanner;

public class Arrayorder {

	public static void main(String[] args) {
		Arraydescending obj = new Arraydescending();
		Scanner sc = new Scanner(System.in);
		int a[]= {2,5,3,7,1,8};
		
		System.out.println("1. first half ascending order");
		System.out.println("2. half decending order");
		int first=sc.nextInt();
		int second=sc.nextInt();
		if(first==1 && second==2)
		{
			int value=a.length/2;
			int[] aa = new int[value];
			for(int i=0;i<value;i++)
				aa[i]=a[i];
			int[] rs = obj.acendingOrder(aa);
			for(int i=0;i<rs.length;i++)
				System.out.print(rs[i]+" ");
			System.out.println();
			int[] aa1 = new int[a.length/2];
			int j=0;
			for(int i=a.length-1;i>=aa1.length;i--) {
				aa1[j]=a[i];
				j++;
			}
			int[] rs1 = obj.decendingOrder(aa1);
			for(int i=0;i<rs1.length;i++)
				System.out.print(rs1[i]+" ");
			
		}
		else {
			if(first==1 && second==1)
			{
				int[] rs = obj.acendingOrder(a);
				for(int i=0;i<rs.length;i++)
					System.out.print(rs[i]+" ");
			}
			else {
				if(first==2 && second==2)
				{
					int[] rs = obj.decendingOrder(a);
					for(int i=0;i<rs.length;i++)
						System.out.print(rs[i]+" ");
				}
				else {
					if(first==2 && second==1)
					{
						int j=0;
						int value1=a.length/2;
						int[] aa = new int[value1];
						for(int i=0;i<value1;i++)
							aa[i]=a[i];
						int[] rs = obj.decendingOrder(aa);
						for(int i=0;i<rs.length;i++)
							System.out.print(rs[i]+" ");
						System.out.println();
						int value=a.length/2;
						int[] aa2= new int[a.length/2];
						for(int i=a.length-1;i>=aa2.length;i--) {
							aa2[j]=a[i];
							j++;
						}
						int[] rs1 = obj.acendingOrder(aa2);
						for(int i=0;i<rs1.length;i++)
							System.out.print(rs1[i]+" ");
					}
				}
			}
		}
		
	}
}
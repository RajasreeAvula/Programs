package fortest;

public class whileloop {

	public static void main(String[] args) {
	   int n=10;
		for(int i=0;i<=n;i++) {	
			if(i>=6) {
				continue;
			}

		System.out.println(i+ ",");
					
		
		for(int j=0;j<=n;j++) {
		if(j==8){
		break;
		}
		System.out.print(j+ ",");

				}
		
		}
	
		System.out.println("end");
	int i=0;	
while(i<=5)
{
 break;
}

int j=10;
do {
	System.out.println("hi");	
	j++;
}	
while(j==3) ;
	}
}
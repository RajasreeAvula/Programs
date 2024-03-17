package Task1;

public class Arraydescending {

	int[] decendingOrder(int[]a)
	{
		for(int i=0;i<a.length;i++) {
		int temp=0;

		for(int j=i+1;j<a.length;j++) {
       if(a[i]<a[j]) {
    	temp=a[i];
    	a[i]=a[j];
    	a[j]=temp;	   
       }
		}
		}
		return a;
}
	
	int[] acendingOrder(int[]a)
	{
		for(int i=0;i<a.length;i++) {
		int temp=0;

		for(int j=i+1;j<a.length;j++) {
       if(a[i]>a[j]) {
    	temp=a[i];
    	a[i]=a[j];
    	a[j]=temp;	   
       }
		}
		}
		return a;
}
}

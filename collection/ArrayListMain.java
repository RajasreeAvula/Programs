package collection;

import java.util.ArrayList;

public class ArrayListMain {

	public static void main(String[] args) {
		
		int intarray[] = {10,20,30,40,50};
		System.out.println(intarray);
		intarray[3]=40;
        System.out.println(intarray[3]);
        
        
      ArrayList arraylist=new ArrayList();
      arraylist.add(10);
      arraylist.add('a');
      arraylist.add("hii");
      arraylist.add(1);
      System.out.println(arraylist);
      
      
      arraylist.remove(2);
      System.out.println("arraylist after remove :"+ arraylist );
      arraylist.contains(0);
      System.out.println("arraylist  :"+ arraylist);
      
      
      
	}

}

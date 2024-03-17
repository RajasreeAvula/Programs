package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Task2 {

	public static void main(String[] args) {
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		arraylist.add(10);
		arraylist.add(40);
		arraylist.add(50);
		arraylist.add(25);
		arraylist.add(8);
		arraylist.add(1);
		arraylist.add(40);
		arraylist.add(10);
		arraylist.add(50);
		arraylist.add(8);
		System.out.println(arraylist);
		
		
		
		ArrayList<Integer> newlist=new ArrayList<Integer>();
		
		for(int i=0;i<=arraylist.size();i++) {
			if(!newlist.contains(arraylist.get(i))) {
			  newlist.add (arraylist.get(i));	
			  System.out.println(newlist);
			}
		
	}
		
		
	}
}

	
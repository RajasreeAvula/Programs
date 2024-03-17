package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTask {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(0, "hii");
		map.put(1,"hloo" );
		map.put(2,"Raj" );
		map.put(3,"Sree" );
		map.put(4,"Satya" );
		System.out.println(map);
		
		
		
		for(Entry<Integer,String> entry:map.entrySet() ) {
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
			
			
		}

	}

}

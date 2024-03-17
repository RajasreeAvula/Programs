package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date2 {

	public static void main(String[] args) {
		Date date=new Date();
       SimpleDateFormat obj=new SimpleDateFormat();
       
      String s1="dd-MM-yy";
       
	System.out.println(date.getDay());
	System.out.println(date.getMonth());
	System.out.println(date.getHours());
	System.out.println(date.getMinutes());
	System.out.println(date.getSeconds());
	System.out.println(date.getTime());
	System.out.println(date.getMonth());
	
	date.setMonth(3);
	System.out.println(date);
	date.setYear(2021);
	System.out.println(date);
	
	date.setHours(12);
	System.out.println(date);
	date.setSeconds(54);
	System.out.println(date);
	
	Date d1=new Date();
	if(date.compareTo(d1)>0)
		System.out.println(date);
	else
		System.out.println((d1) + "is less than Zero");
	
  
	}

}

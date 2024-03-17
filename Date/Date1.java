package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {
	public static void main(String[] args) {
		
		Date date=new Date();
		System.out.println(date);
		
//		String s ="MM/yy/hh";
//	SimpleDateFormat obj=new SimpleDateFormat(s);
//	System.out.println(obj.format(date));
		
//	 String s2="MMM-yyy-hh:ss";
//	 SimpleDateFormat obj1=new SimpleDateFormat(s2);
//	 System.out.println(obj1.format(date));
		
//		String s3="dd-MM-yyy:hh-mm:ss.sss";
//		SimpleDateFormat obj2=new SimpleDateFormat(s3);
//		System.out.println(obj2.format(date));
		
//		String s4="hh:mm:ss dd-MM-yyy";
//		SimpleDateFormat obj3=new SimpleDateFormat(s4);
//		System.out.println(obj3.format(date));
//		
		String s5="dd/MM:hh-mm-ss";
		SimpleDateFormat obj4=new SimpleDateFormat(s5);
		System.out.println(obj4.format(date));
		
	}
}



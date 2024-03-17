package Date;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class NewDateApl {

	public static void main(String[] args) {
		Date date=new Date();
		LocalDate localdate=LocalDate.now();
		System.out.println(localdate.now());
		
		LocalTime localtime=LocalTime.now();
		System.out.println(localtime.now());
		
		LocalDateTime localdandt=LocalDateTime.now();
		System.out.println(localdandt.now());
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MMM dd,YYY");
		System.out.println(dtf.format(localdate));
		
		
		
       
	}

}

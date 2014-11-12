package org.CoreJava.Basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();
		
		SimpleDateFormat ft =   new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

		System.out.println("Current Date: " + ft.format(date));
		
		 
			      
		System.out.println("Current Date and time = " +(date.toString()));
		
		String str = String.format("Current Date/Time : %tc", date );
		 System.out.printf(str);
		 System.out.println();
		 System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
	}

}

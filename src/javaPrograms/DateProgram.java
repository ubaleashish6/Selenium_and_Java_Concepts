package javaPrograms;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateProgram {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		String mydate="20/1/2016";
		SimpleDateFormat dfmt = new SimpleDateFormat("dd/MM/yyyy");
		Date date = dfmt.parse(mydate);
		System.out.println(date);
		String newdate = dfmt.format(date);
		System.out.println(newdate);
		
		SimpleDateFormat dfmt1 = new SimpleDateFormat("MMMM yyyy");
		String expmnthyr = dfmt1.format(date);
		System.out.println(expmnthyr);
		
		SimpleDateFormat dfmt2 = new SimpleDateFormat("d");
		String day = dfmt2.format(date);
		System.out.println(day);
		
		
		Date currentdate=new Date();
		
		long time=currentdate.getTime();
		Timestamp ts=new Timestamp(time);
		System.out.println("Current time: "+ts);
		
		System.out.println(new SimpleDateFormat("dd/MM/yyyy_hh:mm:ss").format(new Date()));
	}

}

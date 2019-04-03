package com.schenker.gc.console;


import com.schenker.gc.utility.AnonymousClassDemo;
import com.schenker.gc.utility.CalendarUtility;
import com.schenker.gc.utility.DayofWeek;
import com.schenker.gc.utility.FileUtility;
import com.schenker.gc.utility.LogHelper;

public class Business01 {
	
	public Business01(){
	   LogHelper logger = new LogHelper();
	   logger.write("hh");
	}
	
	/**
	 * 
	 * @param day
	 * @return
	 */
	public boolean getIsWeekend(String day){
		DayofWeek dayofWeek = DayofWeek.valueOf(day);
		return dayofWeek.isWeekend();
	}
	
	public void readLine() throws Exception{
		System.out.println(FileUtility.readLine());
	}
	
	public void write(String contents) throws Exception{
		System.out.println(FileUtility.writeToEnd(contents));
	}
	
	public void getCalendar() throws Exception{
		System.out.println(CalendarUtility.getDateTimeDiff());
		CalendarUtility c = new CalendarUtility();
		CalendarUtility.InnerX x = c.new InnerX();
		System.out.println(x);
	}
	
	public void printAnonymous() throws Exception{
		AnonymousClassDemo anonymous = new AnonymousClassDemo();
		anonymous.execute();
	}
}

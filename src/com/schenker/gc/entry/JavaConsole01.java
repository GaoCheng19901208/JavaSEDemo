package com.schenker.gc.entry;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Properties;
import com.schenker.gc.console.Business01;

public class JavaConsole01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Parent p = new Child();
		p.play();
		
		Business01 b = new Business01();
		System.out.println(b.getIsWeekend("MON"));
		b.readLine();
		b.write("acd\r\nef");
		b.getCalendar();
		b.printAnonymous();
	}
}

class Parent{
	
	public void play() throws IOException{
        System.out.println("jjj");
	}
}

class Child extends Parent{
	@Override
	public void play() throws IOException{
		Properties property = new Properties();
		InputStream inputStream = Parent.class.getResourceAsStream("config.properties");
		property.load(inputStream);
        System.out.println("kkkk");
	}
}


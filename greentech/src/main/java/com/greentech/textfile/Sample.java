package com.greentech.textfile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Sample {
public static void main(String[] args) {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	LocalDate localDate = LocalDate.now();
	String d=dtf.format(localDate); //2016/11/16
	
	if(!d.equals("2020/12/31")) {
		System.out.println("ko");
		
	}
}
}

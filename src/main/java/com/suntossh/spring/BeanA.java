package com.suntossh.spring;

import java.util.Calendar;

public class BeanA {

	private Calendar calender;
	
	public BeanA(Calendar calender) {
		System.out.println("Instantiating BeanA with Calender Instance, using factory getInstance method of Calender");
		this.calender = calender;
	}
	
	
	public int getCurrentYear(){
		System.out.println(this.calender.get(Calendar.YEAR));
		return this.calender.get(Calendar.YEAR);
	}
}

package com.suntossh.spring;

public class CustomFactory {
	
	private CustomFactory(){
		System.out.println("Constructor of CustomFact");
	}
	
	public BeanB getBeanBInstance(){
		System.out.println("creating BeanB to Retrun from Factory");
		return new BeanB();
	}
	
}

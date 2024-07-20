package com.roshtorres.schoolapp.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.roshtorres.schoolapp.domain.*;

public class SchoolApp 
{
	public static void main(String[] args) 
	{
		//Open container by config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		//Read bean
		SchoolRecord record = context.getBean("record", SchoolRecord.class);
		
		//Print school record
		System.out.println(record);
		
		//Close context of the container
		context.close();
	}

}

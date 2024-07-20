package com.roshtorres.schoolapp.domain;

public class SchoolRecord 
{
	public int id;
	public String name;
	public Person person;
	
	public SchoolRecord()
	{
		
	}
	
	public SchoolRecord(int id, String name, Person person) 
	{
		this.id = id;
		this.name = name;
		this.person = person;
	}
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public Person getPerson() 
	{
		return person;
	}
	public void setPerson(Person person) 
	{
		this.person = person;
	}	
	
	public String toString()
	{
		String output;
		
		output = person.getLabel() + " Number: " + getId() + "\n" +
				 person.getLabel() + " Name: " + getName() + "\n" +
				 "Initial Thoughts: " + person.getInitialThoughts() + "\n" +
				 "Idea of fun: " + person.showFun();
		
		return output;
	}

}

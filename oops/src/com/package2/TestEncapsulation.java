package com.package2;

class Encapsulation 
{
	    private String Name; 
	    private int Roll; 
	    private int Age;
	    public int getAge()  
	    { 
	      return Age; 
	    } 
	    public String getName()  
	    { 
	      return Name; 
	    } 
	    public int getRoll()  
	    { 
	       return Roll; 
	    } 
	    public void setAge( int newAge) 
	    { 
	      Age = newAge; 
	    } 
	    public void setName(String newName) 
	    { 
	      Name = newName; 
	    } 
	    public void setRoll( int newRoll)  
	    { 
	      Roll = newRoll; 
	    } 
}
	public class TestEncapsulation 
	{     
	    public static void main (String[] args)  
	    { 
	        Encapsulation obj = new Encapsulation(); 
	        obj.setName("Hemanth"); 
	        obj.setAge(22); 
	        obj.setRoll(45); 
	        System.out.println("My name: " + obj.getName()); 
	        System.out.println("My age: " + obj.getAge()); 
	        System.out.println("My roll: " + obj.getRoll());      
	    } 
	}


package com.pack1;
interface Second
{  
    default void show() 
    { 
        System.out.println("Default Second interface"); 
    } 
} 
interface Third 
{  
    default void show() 
    { 
        System.out.println("Default Third interface "); 
    } 
}  
public class Diamond implements Second ,Third
{  
    public void show() 
    {  
        Second.super.show(); 
        Third.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        Diamond ob = new Diamond(); 
        ob.show(); 
    } 
}

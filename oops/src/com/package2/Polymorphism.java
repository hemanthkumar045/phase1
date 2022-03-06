package com.package2;

class Polymorphism 
{
    public int sum(int x, int y) 
    { 
        return (x + y); 
    } 
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double sum(double x, double y) 
    { 
        return (x + y); 
    } 
    public static void main(String args[]) 
    { 
        Polymorphism s = new Polymorphism(); 
        System.out.println(s.sum(20, 30)); 
        System.out.println(s.sum(20, 30, 40)); 
        System.out.println(s.sum(12.5, 25.5)); 
    } 
}

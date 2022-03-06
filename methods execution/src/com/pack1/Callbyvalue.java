package com.pack1;

//call by value//
public class Callbyvalue {

int val=220;

int operation(int val) {
	val =val*11/120;
	return(val);
}

public static void main(String args[]) {
	Callbyvalue d = new Callbyvalue();
	System.out.println("Before operation value of data is "+d.val);
	d.operation(150);
	System.out.println("After operation value of data is "+d.val);
	}
}

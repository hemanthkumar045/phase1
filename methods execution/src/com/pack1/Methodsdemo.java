package com.pack1;
public class Methodsdemo {

public int multipynumbers(int a,int b) {
	int z=a*b;
	return z;
}

public static void main(String[] args) {

	Methodsdemo b=new Methodsdemo();
	int ans= b.multipynumbers(125,8);
	System.out.println("Multipilcation is :"+ans);
}
}  



package com.pack1;
public class Arrays {

public static void main(String[] args) {

//single-dimensional array
int a[]= {40,50,60,70,80,90};
for(int i=0;i<6;i++) {
System.out.println("Elements of array a: "+a[i]);
}


//multidimensional array
int[][] b = {
            {5, 7, 9, 11,13,18,21,25}, 
            {4, 3, 8} };
      
      System.out.println("\nLength of row 1: " + b[0].length);
      }
}


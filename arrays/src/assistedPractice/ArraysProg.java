
package assistedPractice;

public class ArraysProg 
{
	    public static void main(String[] args) 
	    {  
	        int[][] array1 = { { 1, 2 }, { 3, 4 } }; 
	        for (int k = 0; k < 2; k++)
	        {               
	            for (int k1 = 0; k1 < 2; k1++) 
	            {     
	                System.out.print(array1[k][k1] + " "); 
	            } 
	         System.out.println(" "); 
	        } 
	        int [] oneDimArray = {1, 9, 34, 96};

		     
		      for (int i = 0; i < oneDimArray.length; i++) {
		         System.out.println(oneDimArray[i] + " " +i);
		      }
		      
		      int ar[] = new int[4];
		      int size = ar.length;
		      System.out.println("size of array is :" + size);
		      
		      
		     
		      
		      double sum = 0;
		      for (int i = 0; i < oneDimArray.length; i++) {
		         sum += oneDimArray[i];
		      }
		      System.out.println("sum is becomes: " + sum);
		      
		      
		      double maximum = oneDimArray[0];
		      for (int i = 1; i < oneDimArray.length; i++) {
		         if (oneDimArray[i] > maximum) 
		        	 {
		        	    maximum = oneDimArray[i];
		        	 }
		      }
		      System.out.println("Max is " + maximum); 
	    } 
	  
		       
		   


}
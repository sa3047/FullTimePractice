package com.java.arrays;
/*
 * @author: Swapnil Aher
 * @purpose: Find 2n highest element from the Array
 * */

public class SecondMaxInArray {
	static int _1stMaxNum =0;
	static int _2ndMaxNum =0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {6,5,8,9,1,3};
		
		find2ndMax(arr);

	}

	 static void find2ndMax(int[] arr) {
		// TODO Auto-generated method stub
	
		 for(int i=0;i<=arr.length-1;i++)
		 {
			 if(arr[i]>_1stMaxNum)
			 {
				 _2ndMaxNum = _1stMaxNum;
				 _1stMaxNum=arr[i];
				
			 }
			
		 }
		 
		 if(arr[arr.length-1]>_2ndMaxNum)
			 _2ndMaxNum= arr[arr.length-1];
		 
		 System.out.println("2nd Max element in array " +_2ndMaxNum);
		 
	}

}

package com.java.arrays;
/*
 * @author: Swapnil Aher
 * @purpose: Find 2n highest element from the Array
 * @checked for positive and negative integers
 * */

public class SecondMaxInArray {
	
	static int _1stMaxNum =Integer.MIN_VALUE;
	static int _2ndMaxNum =Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test case 1
		//int[] arr = {6,5,8,9,1,3};
		
		//test case 2
		int[] arr = {-1,-13, -30, -10, -34, -2,-3};
		
		find2ndMax(arr);

	}

	 static void find2ndMax(int[] arr) {
		// TODO Auto-generated method stub
	 try {
		 
			 for(int i=0;i<=arr.length-1;i++)
			 {
				 if(arr[i]>_1stMaxNum)
				 {
					 _2ndMaxNum = _1stMaxNum;
					 _1stMaxNum=arr[i];
					
				 }
				 if(  arr[i] > _2ndMaxNum  & arr[i]!=_1stMaxNum)
					 _2ndMaxNum= arr[i];
			 }
			 
		 
		 System.out.println("2nd Max element in array " +_2ndMaxNum);
		 
		 
	} catch (Exception e) {
		// TODO: handle exception
	}
		 
		 
	}

}

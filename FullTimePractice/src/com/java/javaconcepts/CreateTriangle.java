package com.java.javaconcepts;

class CreateTriangle
{

	public static void main(String[] args)
	{
		CreateTriangle obj = new CreateTriangle();
		int[] input ={4,7,3,6,7};
		obj.printTriangle(input,input.length);
		
		for(int i=0;i<input.length;i++)
			System.out.print(input[i]+",");
	}	

	void printTriangle(int[] input,int length)
	{
		//base case
		if(input.length == 0) {
		//System.out.println(input[0]);
		return;
		}
		
		//declare a temp array to store a result
		int[] temp = new int[length-1];
		
		for(int i =0;i< input.length-1;i++)
		{
			temp[i] = input[i]+input[i+1];
		}
		
		printTriangle(temp, temp.length);
		
		// print a triangle
		for(int i=0;i<length-1;i++)
		{
			System.out.print(temp[i] + ",");
		}
		
		System.out.println("\n");
	}
}
package com.javaprograms.string;

public class ReverseStringRecur {


	public void reverseString(String str)
	{		
		if(str.length()!=0)
		{
			System.out.print(str.charAt(str.length()-1));
			reverseString(str.substring(0, str.length()-1));
		}
		
		/*for(int i=temp.length-1;i>=0;i--)
		{
			System.out.println(temp[i]);
		}*/
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseStringRecur obj = new ReverseStringRecur();
		obj.reverseString("swapnil");
		//reverseString("swapnil");

	}

}

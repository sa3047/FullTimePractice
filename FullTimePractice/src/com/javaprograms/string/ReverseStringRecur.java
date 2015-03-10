package com.javaprograms.string;

/*@author : Swapnil Aher
 *@Date: 3/10/2015
 *@purpose: Recursive function to reverse the string
 * */
public class ReverseStringRecur {
  static int len =0;
  static int cnt=0;
	public void reverseString(char[] str)
	{		
		if(cnt !=str.length)
		{
			cnt++;
			reverseString(str);
			
		}
		len--;
		
		if(len>=0)
		System.out.print(str[len]);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseStringRecur obj = new ReverseStringRecur();
		String input ="geeks for geeks";
		len=input.length();
		obj.reverseString(input.toCharArray());

	}

}

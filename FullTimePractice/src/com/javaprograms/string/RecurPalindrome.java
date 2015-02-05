package com.javaprograms.string;

public class RecurPalindrome {

	boolean isStrPalindrome (String str)
	{
		boolean result = false;
		// check wether string is even or odd
		if (str.length()%2==0) // even
		{
			
		}
		else //
		{
			//check the proper condition 1st
			if (str.charAt(0)==str.charAt(str.length()-1) && str.length()!= 1)
			{
				System.out.println(str.charAt(0));
				result = isStrPalindrome(str.substring(1,str.length()-1));
			}
			else if (str.length() == 1)
			{
				System.out.println(str.charAt(0));
				return result = true;
			}
		}
		return result;
		
		//return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecurPalindrome obj = new RecurPalindrome();
		System.out.println(obj.isStrPalindrome("12321"));
		/*{
			System.out.println("not a palindrome");
		}
		else
		{
			System.out.println("a palindrome");
		}*/
	}

}

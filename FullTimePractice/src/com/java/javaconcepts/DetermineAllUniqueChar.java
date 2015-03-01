package com.java.javaconcepts;

class DetermineAllUniqueChar
{
	public static void main(String[] args)
	{
			DetermineAllUniqueChar obj = new DetermineAllUniqueChar();
			if(obj.mCheckAllUnique("abcde".toCharArray()))
			{
				System.out.println("String have all unique charater");
			}
			else
			{
				System.out.println("String does not have all unique character");
			}
	}

	boolean mCheckAllUnique(char[] input)
	{
		boolean[] boolValue = new boolean[256];
		boolean result =true;
		for(int i =0;i<input.length;i++)
		{
			if(boolValue[(int)input[i]] == true) // that means char it already present
			{
				 result =false;
			}
			{
				boolValue[(int)input[i]] =true;
			}
		}
		
		return result;
	}
}
package com.javaprograms.string;

public class findFirstNonRepeatingChar {

	char returnFirstChar(String str)
	{
		int[] binary_hash = new int[255];
		char[] result = new char[255];
		int res_index ;
		
		res_index =0;
		for (int i =0 ; i<str.length();i++)
		{
			int ascii;
			ascii = (int)str.charAt(i);
			if (binary_hash[ascii] > 0)
			{
				binary_hash[ascii] = binary_hash[ascii] + 1;
			}
			else
			{
				binary_hash[ascii] = 1;
				result[res_index] = str.charAt(i);
				res_index++;
			}
		}
		
		for (int i = 0; i<result.length;i++)
		{
			int ascii;
			ascii =(int) result[i];
			if (binary_hash[ascii] == 1)
				return result[i];
			else
				continue;
		}
		
		return '0';
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findFirstNonRepeatingChar obj = new findFirstNonRepeatingChar();
		System.out.println(obj.returnFirstChar("CCCAAT"));
	}

}

package com.javaprograms.string;

public class RemoveChar {
	
	public char[] mGetMaskedString(String first,String second)
	{
		//
		char[]  secondStringArray = second.toCharArray();
		
		char[] result= new char[255];
		
		int res_ptr;
		//
		
		boolean[] bin_hash = new boolean[255];
		
		for (int i =0;i<secondStringArray.length;i++)
		{
			int asciivalue;
			asciivalue = (int)secondStringArray[i];
			
			if (bin_hash[asciivalue]!= true )
			{
				bin_hash[(int)secondStringArray[i]] = true;;
			}
			else
			{
				//don't do any thing
			}
		}
		
		res_ptr=0;
		for (int i =0; i<first.length();i++)
		{
			if( bin_hash[(int)first.charAt(i)]== true )
			{
				//if hash value is true that means we are not pushing this into result string array.
			}
			else
			{
				result[res_ptr] = first.charAt(i);
				res_ptr++;
			}
			
		}
	
		return result;
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveChar obj = new RemoveChar();
		System.out.println(obj.mGetMaskedString("teststring", "test"));
		

	}

}

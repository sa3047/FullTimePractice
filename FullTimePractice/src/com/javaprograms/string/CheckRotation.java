package com.javaprograms.string;

public class CheckRotation {

	boolean chkRoation(String str1, String str2)
	{
		String temp;
		temp = str1+str1;
		
		boolean result=false;
		if (temp.contains(str2))
		{
			// Since str2 is a substring of temp, str1 and str2 are 
		    // rotations of each other.
			result = true;
		}
		return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckRotation obj = new CheckRotation();
		obj.chkRoation("ABCD", "DCAB");
	}

}

package com.javaprograms.string;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.naming.BinaryRefAddr;

public class RemoveDupChar {

	public char[] removeDup(String s)
	{
		char[] charArray = s.toCharArray();
		boolean [] bin_hash = new boolean[255];
		char[] resultArray= new char[255];
		
		int res_id=0;
		for(int i=0;i<s.length();i++)
		{
			int asciiValue;
			asciiValue = (int) charArray[i];
			
			if (bin_hash[asciiValue]==true)
			{
				//bin_hash[asciiValue]=true;
				continue;
			}
			else
			{
				resultArray[res_id]=charArray[i];
				bin_hash[asciiValue]=true;
				res_id++;
			}
		}
		
		return resultArray;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDupChar obj = new RemoveDupChar();
		System.out.println(obj.removeDup("geeksforgeeks"));
	}

}

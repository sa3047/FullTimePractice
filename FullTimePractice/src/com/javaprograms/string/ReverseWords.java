package com.javaprograms.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseWords {

	void returnWords(String str)
	{
		List<String> arrList = new ArrayList<String>(Arrays.asList(str.split(" ")));
		
		/*for (String string : arrList) {
			System.out.println(string);
		}*/
		
		for (int i =arrList.size()-1; i> 0 ; i--)
		{
			System.out.println(arrList.get(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWords obj = new ReverseWords();
		obj.returnWords("this string will be reversed by method");
	}

}

package com.javaprograms.string;
import java.lang.*; 
import java.util.HashMap;
import java.util.Map;


////Time Complexity: O(n)
public class ReturnMaxChar {

	int maxCount=0;
	char maxChar;
	void getMaxcharacter(String s)
	{
		
		// Step 1 Convert your string into Array
		char[] temp = s.toCharArray();
		
		//Use HashMap to Store Key and values 
		Map<Character,Integer> countChar = new HashMap<Character,Integer>();
		
		for (int i=0; i<temp.length;i++)
		{
			if (!countChar.containsKey(temp[i]))
			{
				countChar.put(temp[i], 1);
			}
			else
			{
				countChar.put(temp[i], countChar.get(temp[i])+1);
			}
		}
		
		//Printing out the HashMap
		System.out.println(countChar);
		
		//This loop will calculate the Max count from HashMap
		for(Map.Entry<Character, Integer> entries : countChar.entrySet())
		{
			if (maxCount <= entries.getValue())
			{
				maxCount= entries.getValue();
				maxChar = entries.getKey();
			}
			
		}
		
		System.out.println(maxCount+" "+maxChar);
		
		
	}
	
	public static void main(String[] args) {
	
		ReturnMaxChar obj = new ReturnMaxChar();
		obj.getMaxcharacter("test");
	}
	

}

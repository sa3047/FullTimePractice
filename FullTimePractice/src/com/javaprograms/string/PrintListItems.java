package com.javaprograms.string;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintListItems {

	void printList(ArrayList<String> strlist,String str)
	{
		boolean[] binary_hash = new boolean[255];
		boolean[] tempBinary_hash = new boolean[255];
		
		char[] ipChararray = str.toCharArray();
		int count=0;
		int strLength = str.length();
		int len=0;
		
		//created binary hash
		for (int i=0;i<ipChararray.length;i++)
		{
			int Ascii;
			Ascii = (int) ipChararray[i];
			binary_hash[Ascii] = true;
		}
		
		Iterator<String> itr = strlist.iterator();
		String tempStr;
		
		while (itr.hasNext())
		{
			count =0;
			//len =itr.next().length();
			tempStr =itr.next();
			tempBinary_hash=binary_hash.clone();
			//System.out.println(tempStr.length() +" "+tempStr);
			for (int i = 0; i < tempStr.length() ;i++)
			{
				int Ascii;
				Ascii = (int) tempStr.charAt(i);
				if(tempBinary_hash[Ascii]== true)
				{
					count++;
					tempBinary_hash[Ascii] = false;
				}
			}
			
			if (strLength == count)
			{
				System.out.println(tempStr);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ipList = new ArrayList<String>();
	
		ipList.add("sunday");
		ipList.add("geeksforgeeks");
		ipList.add("utensils");
		ipList.add("just");
		ipList.add("sss");
		
		PrintListItems obj = new  PrintListItems();
		obj.printList(ipList,"sun");

	}

}

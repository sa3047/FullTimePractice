package com.javaprograms.string;

public class RunLengthEncoding {
	
	char[] Encoding(char[] str)
	{
		char[] result= new char[str.length];
		//int _previousPtr;
		int cntr=0;
		int charCnt=0;
		
		for (int i=0;i<str.length;i++)
		{
			//add first char to result string
			if(i==0)
			result[cntr]=str[i];
			
			charCnt++;
			
			//check last char
			if ((i+1)==str.length-1)
			{
				//check last char is same as 2nd last char
				if(str[i+1]!=str[i])
				{
					cntr++;
					result[cntr]= (char) charCnt;
					charCnt=1;
					cntr++;
					result[cntr] = str[i+1];
					cntr++;
					result[cntr]= (char) charCnt;
					
					return result;
				}
				else
				{
					cntr++;
					charCnt = charCnt +1;
					result[cntr]=(char) charCnt;
					return result;
				}
			}
			else// check next char in str if it's same or not
			{
				if(str[i+1]!=str[i])
				{
					cntr++;
					result[cntr]= (char)charCnt;
					charCnt=0;
					cntr++;
					result[cntr]=str[i+1];
				}
			}
			
			
		}
	return result;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RunLengthEncoding obj = new RunLengthEncoding();
		System.out.println((obj.Encoding("aaaabbbffggggggg".toCharArray()))); 

	}

}

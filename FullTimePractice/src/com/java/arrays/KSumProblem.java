package com.java.arrays;

import java.util.HashSet;

/*
 * @author: Swapnil Aher
 * @purpose: Given a number K find pairs from the array that sums to that number
 * 			 time complexity of algorithm O(n)
 * 			 similar 2 sum problem
 */
public class KSumProblem {

	public static void main(String[] args){
		//first test case {1,5,9,25,16,8,10};
		//second test case
		int sum = 13;
		HashSet<Integer> ip = new HashSet<Integer>();
		ip.add(1);
		ip.add(3);
		ip.add(10);
		ip.add(7);
		ip.add(3);
		ip.add(6);
		//ip.add(10);
		
		getPairs(ip,sum);
	}
	static void getPairs(HashSet<Integer> ip,int sum)
	{
		int result=0;	
		HashSet<Integer> check = new HashSet<Integer>();
		
		for(Integer i : ip)
		{
			result = sum-i;
			if(ip.contains(result))
			{
				if(check.contains(i)&& check.contains(result))
				{
					
				}
				else
				{
					System.out.println("Printing pairs "+i+", "+result);
					check.add(i);
					check.add(result);
				}
				
			}
		}
		
	}
}

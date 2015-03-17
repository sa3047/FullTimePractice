package com.java.sorting;

import java.util.ArrayList;
import java.util.List;

/*
 * @author: Swapnil Aher
 * @Purpose: To sort a Integer List using merge sort algorithm
 * 			 time complexity of merge sort algorithm is nlog(n)
 */
public class MergeSort {

	public static void main(String[] args)
	{		
		List<Integer> result;
		List<Integer> inp =  new ArrayList<Integer>();
		
		inp.add(5);
		inp.add(1);
		inp.add(3);
		inp.add(8);
		inp.add(9);
		inp.add(6);
		
		result= mergeSort(inp);
		
		System.out.println("Printing out the sorted list");
		
		for(Integer item: result)
		{
			System.out.println(item);
		}
	}
	
	public static List<Integer> mergeSort( List<Integer> list)
	{
		 int mid=0;
		 List<Integer> left;
		 List<Integer> right;
		 
	     if(list.size() ==1)
	    	 return  list;
	     else
	     {
	    	mid = list.size()/2;
	    	left = mergeSort(list.subList(0, mid));
	    	right = mergeSort(list.subList(mid, list.size()));
	    	return mergeList(left, right);
	     }
	}
	
	//this will merge the list
	public static ArrayList<Integer> mergeList( List<Integer> left, List<Integer> right)
	{
		int firstIndex=0;
		int secondIndex=0;
		ArrayList<Integer> result=new ArrayList<Integer>();
		
		while(true)
		{
			
			if(firstIndex>=left.size()&&secondIndex>= right.size())
				break;
			
			//This is true when we are done with first list
			//add items from the second list
			if(firstIndex>=left.size())
			{
				result.add(right.get(secondIndex));
				secondIndex++;
				continue;
			}
			else if (secondIndex>= right.size())
			{
				result.add(left.get(firstIndex));
				firstIndex++;
				continue;
			}
			
			
			//checking first element in list is greater than first element of list second
			if(left.get(firstIndex) > right.get(secondIndex))
			{
				result.add(right.get(secondIndex));
				secondIndex++;
			}
			else
			{
				result.add(left.get(firstIndex));
				firstIndex++;
			}
			
		}
		
		return result;
	}
}


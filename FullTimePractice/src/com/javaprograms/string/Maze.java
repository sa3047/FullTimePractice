package com.javaprograms.string;

public class Maze {

	public static boolean foo()
	{
		System.out.println("called foo");
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("called bar");
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int a =2;
		int b=4;
		System.out.println(a | b);
		System.out.println(foo() | bar());
		System.out.println(foo() || bar());
	}

	int binarySearch(int[] array, int value, int left, int right) {
	      if (left > right)
	            return -1;
	      int middle = (left + right) / 2;
	      if (array[middle] == value)
	            return middle;
	      else if (array[middle] > value)
	            return binarySearch(array, value, left, middle - 1);
	      else
	            return binarySearch(array, value, middle + 1, right);           
	}


	class Node
	{
		Node left,right;
		int data;
		Node(int newData)
		{
			left = right=null;
			data = newData;
		}
	}
	
	private static int isPresent(Node root, int val)
	{
		if (root.data == val)
		{
			return 1;
		}
		
		if (val > root.data)
		{
			isPresent(root.right , val);
		}
		else
		{
			isPresent(root.left , val);
		}
		
		return 0;
	}
}
 
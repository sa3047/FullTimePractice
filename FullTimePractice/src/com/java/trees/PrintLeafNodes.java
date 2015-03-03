package com.java.trees;
import java.util.Stack;


//@Author : Swapnil Aher
//@Date : 3 march 2015
// This program will print all leaf nodes of a tree

public class PrintLeafNodes {
	
	public static void main(String[] args)
	{
		// create a tree using node
		
		Tree root = new Tree(1);
		root.leftNode= new Tree(2);
		root.rightNode = new Tree(3);
		root.leftNode.leftNode= new Tree(4);
		root.leftNode.rightNode = new Tree(5);
		
		String path = "";
		//path.append("");
		recurse(root,path);
	}

	static void recurse(Tree root, String path)
	{
		//Stack<Integer> storeLength = new Stack<Integer>();
		//StringBuilder pathString =path;
		
		//path.append(root.data);
		path = path + root.data;
		
		if(root.leftNode == null && root.rightNode==null && root.visited == false)
		{
			System.out.println(path.toString());
			root.visited=true;
			return;
		}
			
		else
		{
			recurse(root.leftNode,path);
			//path.deleteCharAt(path.length()-1);
			//path.append( path.substring(0, ));
			
			
			recurse(root.rightNode,path);
		}
			
	}
	
}


// define the Tree Node class
class Tree{
	int data;
	Tree leftNode;
	Tree rightNode;
	boolean visited;
	Tree(int data)
	{
		this.data =data;
		this.leftNode =null;
		this.rightNode = null;
		
	}
}
package com.java.trees;

//@Author : Swapnil Aher
//@Date : 3 march 2015
// This program will print path for all leaf nodes from root of a tree

public class PrintLeafNodes {
	
	public static void main(String[] args)
	{
		
		/*  Create following Binary Tree
	1) Test case 1
        1
      /   \
     2     3
    / \   / \
   5   4 6  7
   
   2) Test case 2
         1
      /  	 \
     2    	 3
    / \  	 / \
   4   5 	6  7
       \   		\     
        8  		 9 
        
    3) Test case 3
    
         1
      /  	 \
     2    	 3
    / \  	 / \
   4   5 	6  7
       \   /     
        8  9                  
        */
		
		Tree root = new Tree(1);
		root.leftNode= new Tree(2);
		root.rightNode = new Tree(3);
		
		root.leftNode.leftNode= new Tree(4); //
		root.leftNode.rightNode = new Tree(5); 
		root.rightNode.leftNode = new Tree(6); //
		root.rightNode.rightNode =new Tree(7);
		
		root.leftNode.rightNode.rightNode = new Tree(8);//
		root.rightNode.leftNode.leftNode =new Tree(9);//
		
		String path = "";
		//path.append("");
		recurse(root,path);
	}

	static void recurse(Tree root, String path)
	{
		// for each recursive call we are creating a separate path string
		if(root.data !=null)
		path = path + root.data;
		
		if(root.leftNode == null && root.rightNode==null && root.visited == false)
		{
			System.out.println(path.toString());
			root.visited=true;
			return;
		}
			
		else
		{
			if(root.leftNode!=null) //don't recurse on left if node is not present e.g. Node 5
			recurse(root.leftNode,path);	
			
			if(root.rightNode!=null) 
			recurse(root.rightNode,path);
		}
			
	}
	
}


// define the Tree Node class
class Tree{
	Integer data;
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
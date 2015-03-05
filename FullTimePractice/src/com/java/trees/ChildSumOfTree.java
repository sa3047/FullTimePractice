package com.java.trees;

import java.util.LinkedList;
import java.util.Queue;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

/*@Auther : Swapnil Aher
 * @Purpose : Check for Children Sum Property in a Binary Tree.
 * 
 */
  
public class ChildSumOfTree {

	 static Integer parentValue=0;
	 static Integer sumOfChild=0;
	 public static void main(String[] args)
	{
		 /*  Create following Binary Tree
		        
		    1) Test case 1
		    
		         12
		      /  	 \
		     8    	  4
		    / \  	 / \
		   3   5 	2   2
		       \    /
		        5   3           
		 */
				
				Node root = new Node(12);
				root.leftNode= new Node(8);
				root.rightNode = new Node(4);
				
				root.leftNode.leftNode= new Node(3); //
				root.leftNode.rightNode = new Node(2); 
				
				root.rightNode.leftNode = new Node(2); //
				root.rightNode.rightNode =new Node(2);
				
				root.leftNode.rightNode.rightNode = new Node(5);//
				root.rightNode.leftNode.leftNode =new Node(3);//
				
				
				if(mCheckSum(root))
				{
					System.out.println("Given tree satisfies the child sum property");
				}
				else
				{
					System.out.println("Given tree does not satisfies the child sum property");
				}
	
	}
	 
	 static boolean mCheckSum(Node node) 
	 {
		 boolean result;
		// if both left and right refernces of nodes are null
        // that means its a leaf node 
		 if(node.leftNode == null & node.rightNode ==null)
		 {
			 return true;
		 }
		 else
		 {
			 if(node.data == ( (node.leftNode==null?0:node.leftNode.data) + (node.rightNode==null?0:node.rightNode.data)))
			 {
				 result= true;
			 }
			 else
			 {
				 result = false;
				 return result;
			 }
		 }
		 
		 if(node.leftNode!=null)
			if (!mCheckSum(node.leftNode)) return false;
		 
		 if(node.rightNode!=null)
		   if(!mCheckSum(node.rightNode)) return false; 
		 
		 return result;
	 }
}

class Node
{
	Integer data;
	Node leftNode;
	Node rightNode;
	
	public Node(Integer data)
	{
		this.data = data;
	}
	
}
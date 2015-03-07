package com.java.trees;

import java.util.Stack;

/*@author: Swapnil Aher
 *@date: 3/6/2015
 *@purpose: Inorder Traversal using stack with recursion
 *@Algorithm:
 *1) 
 */
public class InorderTraversalWithoutRecursion {

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
		clsTree root = new clsTree(12);
		root.leftNode= new clsTree(8);
		root.rightNode = new clsTree(4);
		
		root.leftNode.leftNode= new clsTree(3); //
		root.leftNode.rightNode = new clsTree(5); 
		
		root.rightNode.leftNode = new clsTree(2); //
		root.rightNode.rightNode =new clsTree(2);
		
		root.leftNode.rightNode.rightNode = new clsTree(5);//
		root.rightNode.leftNode.leftNode =new clsTree(3);//
		
		inorderTraversal(root);
			
	}
	static void inorderTraversal(clsTree node)
	{
		clsTree current = null;
		clsTree popNode =null;
		Stack<clsTree> st = new Stack<clsTree>();
		current = node;
		
	    
			
				while(true)
				{
					if (current != null )
					{
						//push it on stack
						st.push(current);
						current = current.leftNode;
					}
					else if(current == null & !st.isEmpty())
					{
						popNode= st.pop();
						System.out.println(popNode.data);
						
						current = popNode.rightNode;
						continue ;
					}
					else if (current ==null & st.isEmpty())
					{
						break;
					}
					
				}
		
		
		
	}
}

class clsTree
{
	Integer data;
	clsTree leftNode;
	clsTree rightNode;
	
	public clsTree(Integer data)
	{
		this.data = data;
		leftNode =null;
		rightNode = null;
	}
	
}

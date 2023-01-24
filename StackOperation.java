package com.bridgelabs.stack;

import java.util.Stack;

public class StackOperation {

	public static void main(String[] args) 
	{
		Stack<Integer> s=new Stack<>();
		s.push(70);
		s.push(30);
		s.push(56);
		
		System.out.println("Stack is:"+s);
		
		System.out.println("Top Element in Stack:"+s.peek());
		s.pop();
		System.out.println(s);
		System.out.println("Top Element:"+s.peek());
		s.pop();
		System.out.println(s);
		System.out.println("Top Element:"+s.peek());
		s.pop();
		System.out.println(s);
		
		System.out.println("Stack Empty...");
		
		
		
	}

}

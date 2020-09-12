package com.stack;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
     Stack<String> s=new Stack<String>();
     s.push("Naga");
     s.push("Swarna");
     s.push("Devansh");
     s.push("Jacci");
     System.out.println(s);//Here also insertion order will be preserved
     s.pop(); //last value will be removed as it's LIFO
     System.out.println(s);
	}

}

package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {
    int[] numbers= {40,11,22,100};
    ArrayList al=new ArrayList();
    al.add(20);
    al.add(10);
    al.add(45);
    System.out.println(al);
    Collections.sort(al);
    System.out.println(al);
    al.addAll(Arrays.asList(numbers));
    System.out.println(al);
    
	}

}

package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {
     ArrayList<String> al =new ArrayList<String>();
     al.add("Naga");
     al.add("Swarna");
     al.add("Jacci");
     al.add("Devansh");
     System.out.println(al);
     Collections.sort(al);
     System.out.println(al);
     String[] s= {"Ramya","Sowmya","Abc"};
     al.addAll(Arrays.asList(s));
     System.out.println(al);
     Collections.sort(al);
     System.out.println(al);

	}

}

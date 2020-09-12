package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(4, "Naga");
		hm.put(2, "Swarna");
        hm.put(3,"Devansh");
        hm.put(1,"Jacci");
        System.out.println(hm);//Insertion order will not be preserved
        Set<Entry<Integer,String>> s=hm.entrySet();
        for(Entry<Integer,String> e:s) {
        	System.out.println(e.getKey()+":"+e.getValue());
        }
        Set<Integer> s1=hm.keySet(); //keySet return type is Set
       for(Integer i:s1){
        	System.out.println(i);
        }
       Iterator<Integer> itr=hm.keySet().iterator();
       while(itr.hasNext()) {
    	   System.out.println((Integer)itr.next());
       }
        Collection<String> s2= hm.values(); //values return type is Collection
        for(String i:s2){
        	System.out.println(i);
        }
	}

}

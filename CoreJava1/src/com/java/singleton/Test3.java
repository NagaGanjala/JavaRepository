package com.java.singleton;

class Single1 {
	static Single1 sObj=new Single1();
	
	private Single1() {
		
	}
	
	public static Single1 getRef() {
		return sObj;
	}
	
	
}
public class Test3 {
	
		public static void main(String[] args) {
			System.out.println(Single1.getRef());
			System.out.println(Single1.getRef());

	}
	

}



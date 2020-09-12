package com.java.singleton;

class Single {
	static Single sObj=null;
	static {
		sObj =new Single();
	}
	private Single() {
		
	}
	
	public static Single getRef() {
		return sObj;
	}
	
	
}
public class Test2 {
	
		public static void main(String[] args) {
			System.out.println(Single.getRef());
			System.out.println(Single.getRef());

	}
	

}



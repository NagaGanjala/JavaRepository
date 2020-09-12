package com.java.singleton;
//Don't use same class name more than once with in the project
class Singleton {
	static Singleton sb=null;
	private Singleton() {
		
	}
	public static Singleton getRef() {
		if(sb==null) {
			sb=new Singleton();
			return sb;
		}else {
			return sb;
		}
	}
	
	
}
public class Test1 {
	
		public static void main(String[] args) {
			System.out.println(Singleton.getRef());
			System.out.println(Singleton.getRef());

	}
	

}



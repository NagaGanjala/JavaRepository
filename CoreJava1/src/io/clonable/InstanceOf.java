package io.clonable;

class A{
	
}
class B extends A{
	
}
class C extends B{
	
}
class D extends C{
	
}

public class InstanceOf {

	public static void main(String[] args) {
       A a =new A();
       B b=new B();
       System.out.println(a instanceof A);//true
       System.out.println(a instanceof B);//false
       System.out.println(b instanceof A);//true
       System.out.println(a instanceof C);//false
	}

}

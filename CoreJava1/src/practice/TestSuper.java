package practice;
class A1{
	A1(){
		System.out.println("A-Con");
	}
	A1(int n){
		System.out.println("A-int-param-Con");
	}
}
class B1 extends A1{
	B1(){
		super(10);
		System.out.println("B-Con");
	}
}

public class TestSuper {

	public static void main(String[] args) {
        B1 b1=new B1();
	}

}

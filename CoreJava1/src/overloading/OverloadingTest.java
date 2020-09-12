package overloading;

public class OverloadingTest {
	void m1(int a) {
		System.out.println("Given value is:"+a);
	}
	int m1(int a,int b) {
		System.out.println("Sum of a and b is :"+(a+b));
		return a+b;
	}
	public static void main(String[] args) {
		OverloadingTest obj =new OverloadingTest();
		obj.m1(10);
		obj.m1(20, 30);
		
	}
}

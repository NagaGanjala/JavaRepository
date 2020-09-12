package practice;

class A9{
	static {
		System.out.println("Class Loading");
	}
	
	A9(){
		System.out.println("Object Creation");	
	}
	  A9(int n){
		System.out.println("Object Creation with Argument");
	}
}
class Test {

	public static void main(String[] args) throws Exception {
       Class c =Class.forName("practice.A9"); //We have to provide fully qualified name
       A a=(A) c.newInstance();
		
		//A a =new A();
	}

}

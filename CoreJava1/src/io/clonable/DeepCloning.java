package io.clonable;
//Example for Deep Copy or Deep Cloning
class Address implements Cloneable{
	long mobileNumber;
	String email;
	public Address(long mobileNumber, String emai) {
		super();//Even though we didn't add JVM will add this by default in every constructor
		this.mobileNumber = mobileNumber;
		this.email = emai;
	}
}
//Cloning or Shallow cloning
public class DeepCloning implements Cloneable{
	int age;
	String name;
	Address address;
	DeepCloning(int age,String name,Address address){
		this.age=age;
		this.name=name;
		this.address=address;
	}
	
	void getData() {
		System.out.println("---------------------------");
		System.out.println("Age is:"+age);
		System.out.println("Name is:"+name);
		System.out.println("****Address***");
		System.out.println("Mobile Number is:"+address.mobileNumber);
		System.out.println("Email is:"+address.email);
		
	}
	@Override //Here we are overiding Object Class Clone method
	//Deep Copy or Deep Clone
	 protected Object clone() {
		Address add=new Address(address.mobileNumber,address.email);
		DeepCloning tt1=new DeepCloning(25,"Naga Ganjala",add);
		return tt1;
		
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Address ad=new Address(9966525534l,"Naga.Ganjala@gmail.com");
         DeepCloning t1=new DeepCloning(25,"Naga Ganjala",ad);
         t1.getData();
         
         DeepCloning t2=(DeepCloning) t1.clone();
         t2.getData();
         
	}

}

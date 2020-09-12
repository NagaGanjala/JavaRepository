package io.clonable;

//Cloning or Shallow cloning
public class ShallowClone implements Cloneable{
	int age;
	String name;
	ShallowClone(int age,String name){
		this.age=age;
		this.name=name;
	}
	
	void getData() {
		System.out.println("---------------------------");
		System.out.println("Age is:"+age);
		System.out.println("Name is:"+name);
		
	}

	public static void main(String[] args) throws CloneNotSupportedException {
         ShallowClone t1=new ShallowClone(25,"Naga Ganjala");
         t1.getData();
         
         ShallowClone t2=(ShallowClone) t1.clone();
         t2.getData();
         
	}

}

package obj.creation;

public class NewInstanceExample  
{  
  String str="hello";  
public static void main(String args[])  
{  
try  
{  
//creating object of class  
NewInstanceExample obj= NewInstanceExample.class.newInstance();   
System.out.println(obj.str); 

//OR By using Class.forName() method
//We have to pass fully qualified class name
Class cls=Class.forName("obj.creation.NewInstanceExample");
NewInstanceExample obj1=(NewInstanceExample)cls.newInstance();
System.out.println(obj1.str); 

}  
catch(Exception e)  
{  
e.printStackTrace();  
}  
}  
}  
package obj.creation;
import java.lang.reflect.Constructor;  
public class NewInstanceOfConstructor  
{  
String str="hello";  
public static void main(String args[])  
{  
try  
{  
Constructor<NewInstanceOfConstructor> obj =NewInstanceOfConstructor.class.getConstructor();  
NewInstanceOfConstructor obj1 = obj.newInstance();  
System.out.println(obj1.str);  
}  
catch(Exception e)  
{  
e.printStackTrace();  
}  
}  
}  
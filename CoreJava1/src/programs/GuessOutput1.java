package programs;

class A
{
    int i = 10;
    void m1() {
    	System.out.println("m1-A");
    }
    static void m2() {
    	System.out.println("m2-A");
    }
    
}
 
class B extends A
{
    int i = 20;
    void m1() {
    	System.out.println("m1-B");
    }
    
    static void m2() {
    	System.out.println("m2-B");
    }
}
 
public class GuessOutput1
{
    public static void main(String[] args)
    {
        A a = new B();
        B b=new B();
        //Operator Overriding not supported in Java 
        System.out.println(a.i);//Interview Question
        System.out.println(b.i);
        
        //Method Overriding --instance methods
        a.m1();//Interview Question
        b.m1();
        
        
        //We cannot Override static method --static methods--It is called Over-Hiding
        // In fact we will not call static methods with references
        a.m2();//Interview Question
        b.m2();
    }
}

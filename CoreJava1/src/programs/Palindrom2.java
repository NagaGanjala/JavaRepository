package programs;

import java.util.HashSet;

//Service Now Company Interview Question
//Check given number contains Palindrom or not
//Here just I used String Permutations Program+Palindrom Program
public class Palindrom2
{   static HashSet<Integer> hs=new HashSet<Integer>();
    static public void StringPermutation(String input)
    {
        StringPermutation("", input);
    }
    private static void StringPermutation(String permutation, String input)
    {   
        if(input.length() == 0)
        {
            palindromOrNot(permutation);
        }
        else
        {
            for (int i = 0; i < input.length(); i++)
            {  //System.out.println(permutation+input.charAt(i)+"------------------"+input.substring(0, i)+input.substring(i+1, input.length())); 
                StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()));
            }
        }
    }
    public static void palindromOrNot(String s) {
    	
		
		//System.out.println("Reverse Number is:"+reverse);
		//System.out.println("Given Number is:"+temp);
		int n=Integer.parseInt(s);
		int temp=n;
		if(!hs.contains(n)) {
			
			int r=0;
			int reverse=0;
			while(n>0) {
				r=n%10; 
				reverse=reverse*10+r;
				n=n/10;
				
			}
		if(temp==reverse) {
			System.out.println("Given Number is Palindrom*****************:"+temp);
			hs.add(temp);
		}else {
			System.out.println("Given Number is not Palindrom:"+temp);
			hs.add(temp);
		}
		}
    }
    public static void main(String[] args) 
    {
        StringPermutation("3254678");//JSP //4477
    }   
}

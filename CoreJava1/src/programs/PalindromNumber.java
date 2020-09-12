package programs;

public class PalindromNumber {

	public static void main(String[] args) {
		int n=151;//159
		int temp=n;
		int r=0;
		int reverse=0;
		while(n>0) {
			r=n%10; 
			reverse=reverse*10+r;
			n=n/10;
			
		}
		System.out.println("Reverse Number is:"+reverse);
		System.out.println("Given Number is:"+temp);
		if(temp==reverse) {
			System.out.println("Given Number is Palindrom:"+temp);	
		}else {
			System.out.println("Given Number is not Palindrom:"+temp);
		}
		

	}

}

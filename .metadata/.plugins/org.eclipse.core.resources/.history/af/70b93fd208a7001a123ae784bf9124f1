package programs;

public class ArmStrongNumber {
	
	public static void main(String[] args) {
		int arm=0;
		int r=0;
	    int n=456; //Ex:153(1power3+5power3+3power3=153),370,371,407..etc
		int temp=n;
		while(n>0) {
			r=n%10;
			arm=arm+r*r*r;
			n=n/10;
			
		}
		if(temp==arm) {
       System.out.println("Given Number is ArmStrong Number:"+temp);
		}else {
			 System.out.println("Given Number is not a ArmStrong Number:"+temp);
		}
	}

}

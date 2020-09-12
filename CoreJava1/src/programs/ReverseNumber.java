package programs;

public class ReverseNumber {

	public static void main(String[] args) {
		int n=1520;//1523
		int r=0;
		int reverse=0;
		while(n>0) {
			r=n%10; //3
			reverse=reverse*10+r;
			n=n/10;//152
			
		}
		System.out.println("Reverse Numbers is:"+reverse);

	}

}

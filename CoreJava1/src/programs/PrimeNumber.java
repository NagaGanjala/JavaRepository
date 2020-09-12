package programs;

/*Why 1 is not a prime number?
Because it's doesn't satisfy the prime number defination 
i.e. Prime Number is any positive number which must be divisible by 
exactly 2 positive numbers.	
Here 1 is divisible only one positive number
*/	
		

public class PrimeNumber {

	public static void main(String[] args) {
     int n=17,flag=0;
     for(int i=2; i<n/2;i++) {
    	 if(n%i==0) {
    		 flag=1;
    		 System.out.println("Given Number is not a prime: "+n);
    		 break;
    	 }
     }
     if(flag==0) {
    	 System.out.println("Given Number is a prime: "+n); 
     }
     
	}

}

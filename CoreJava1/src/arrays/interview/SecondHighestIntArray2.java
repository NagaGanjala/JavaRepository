package arrays.interview;

import java.util.Arrays;

public class SecondHighestIntArray2
{
  
    public static void main(String[] args)
    {
    	int[] arr=new int[] {45, 51, 28, 75, 49, 42};
    	Arrays.sort(arr);
        System.out.println(arr[arr.length-2]); //output 51
      
    }
}
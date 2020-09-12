package arrays.interview;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;
public class ArrayElementRemovalProgram 
{
    public static void main(String[] args)
    {
        //Define an array with elements
         
        String[] arrayBeforeRemoval = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six"};
         
        System.out.println("Array Before Removal");
         
        System.out.println("=========================");
         
        System.out.println(Arrays.toString(arrayBeforeRemoval));
         
        System.out.println("========================");
         
        //Removing an element from an array at index 2         
        String[] arrayAfterRemoval = ArrayUtils.remove(arrayBeforeRemoval, 2);
      //Removing an element "Five" from array
        arrayAfterRemoval = ArrayUtils.removeElement(arrayAfterRemoval, "Five");
         
        System.out.println("Array After Removal");
         
        System.out.println("========================");
         
        System.out.println(Arrays.toString(arrayAfterRemoval));
    }
}
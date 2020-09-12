package arrays.interview;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
public class ArrayElementRemovalProgram5 
{
    public static void main(String[] args)
    {
        //Define an array with elements
         
        String[] arrayBeforeRemoval = new String[] {"Zero", "One", "Two", "Three", "Two", "Five", "Six"};
        System.out.println("Array Before Removal");
        System.out.println("========================");
        System.out.println(Arrays.toString(arrayBeforeRemoval));
        System.out.println("========================");
        //Removing all occurrences of an element "Two"
        String[] arrayAfterRemoval = ArrayUtils.removeAllOccurences(arrayBeforeRemoval, "Two");
        System.out.println("Array After Removal");
        System.out.println("========================");
        System.out.println(Arrays.toString(arrayAfterRemoval));
    }
}
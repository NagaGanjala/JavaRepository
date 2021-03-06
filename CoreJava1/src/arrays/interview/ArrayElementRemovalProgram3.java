package arrays.interview;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
 
public class ArrayElementRemovalProgram3 
{
    public static void main(String[] args)
    {
        //Define an array with elements
        String[] arrayBeforeRemoval = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six"};
        System.out.println("Array Before Removal");
        System.out.println("========================");
        System.out.println(Arrays.toString(arrayBeforeRemoval));
        System.out.println("========================");
        //Removing elements at index 1, 3, 5
        String[] arrayAfterRemoval = ArrayUtils.removeAll(arrayBeforeRemoval, 1, 3, 5);
        System.out.println("Array After Removal");
        System.out.println("========================");
        System.out.println(Arrays.toString(arrayAfterRemoval));
    }
}
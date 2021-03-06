package arrays.interview;
//A hashing based Java program to find missing 
//elements from an array 

import java.util.Arrays;
import java.util.HashSet; 

public class MissingNumbersInArray { 
 // Print all elements of range [low, high] that 
 // are not present in arr[0..n-1] 
 static void printMissing(int ar[], int low, int high) 
 { 
     HashSet<Integer> hs = new HashSet<Integer>(); 

     // Insert all elements of arr[] in set 
     for (int i = 0; i < ar.length; i++) 
         hs.add(ar[i]); 

     // Traverse through the range an print all 
     // missing elements 
     for (int i = low; i <= high; i++) { 
         if (!hs.contains(i)) { 
             System.out.print(i + " "); 
         } 
     } 
 } 

 // Driver program to test above function 
 public static void main(String[] args) 
 { 
     int arr[] = { 1, 3, 5, 4,9 }; 
     Arrays.sort(arr);
    int low=arr[0],high=arr[arr.length-1]; 
    System.out.println("Least value is:"+low +"   highest value is"+high);
     //int low = 1, high = 10; //here range is 10
     printMissing(arr, low, high); 
 } 
} 
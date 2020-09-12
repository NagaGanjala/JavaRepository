package practice;
/*
 * Interger/Decimal to Roman
 Q) Converting Decimal Number lying between 1 to 3999 to Roman Numerals
    Following is the list of Roman symbols which include subtractive cases also:

SYMBOL       VALUE
I             1
IV            4
V             5
IX            9
X             10
XL            40
L             50
XC            90
C             100
CD            400
D             500
CM            900 
M             1000   
 */
import java.util.HashMap;

public class IToR{
	public static void main(String[] args) {
		integerToRoman(9);
		integerToRoman(40);
		integerToRoman(1904);
	}
 public static void integerToRoman(int n) {
	 String result="";
	 int[] numbers= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	 HashMap<Integer,String> hm=new HashMap<Integer,String>();
	 hm.put(1000, "M");
	 hm.put(900, "CM");
	 hm.put(500, "D");
	 hm.put(400, "CD");
	 hm.put(100, "C");
	 hm.put(90, "XC");
	 hm.put(50, "L");
	 hm.put(40, "XL");
	 hm.put(10, "X");
	 hm.put(9, "IX");
	 hm.put(5, "V");
	 hm.put(4, "IV");
	 hm.put(1, "I");
	 for(int i:numbers) {
		 while(n>=i) {
			result=result+hm.get(i); //M
			n=n-i;
		 }
		 
	 }
	 System.out.println(result);
 }
}
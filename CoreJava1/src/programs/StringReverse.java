package programs;

public class StringReverse {

	public static void main(String[] args) {
      String str="Jacci";
      String rev="";
      for(int i=0;i<str.length();i++) {
    	  rev=str.charAt(i)+rev;
      }
      System.out.println(rev);
	}

}

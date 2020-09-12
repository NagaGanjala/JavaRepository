package programs;

public class StringWordsReverse {

	public static void main(String[] args) {

		String str="Hi This is Naga Ganjala";
		String[] s=str.split(" ");
		System.out.println(s.length);
		String rev="";
		/*
		 * for (int i=0;i<s.length;i++) { rev=" "+s[i]+rev; System.out.println(rev); }
		 */
		for(String word:s) {
			rev=" "+word+rev;
			
			
		}
		System.out.println("**********"+rev);
		
	}

}

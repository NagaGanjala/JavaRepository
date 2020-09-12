/*Q) Will it be possible accessing static members of a class 
 * without creating Object or without using Class?
 */
package staticimport;
import static staticimport.Test.*;
public class UseMembers {
	public static void main(String[] args) {
		m2(); //Able to access without Class Name/Object
		System.out.println(name); //directly accessing here
	}

}

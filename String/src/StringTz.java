import java.util.*;
public class StringTz {

	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("my name is khan");  
	     while (st.hasMoreTokens()) {  
	         System.out.println(st.nextToken());  
	     }  
	     StringTokenizer st1 = new StringTokenizer("hello,world hjfhjgjhg");  
	     System.out.println(st1.nextToken(","));
	     System.out.println(st1.nextElement());
	   //  System.out.println(st1.nextToken());CT
	}

}

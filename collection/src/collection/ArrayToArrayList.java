package collection;
import java.util.*;
public class ArrayToArrayList {

	public static void main(String[] args) {
		Integer arr[]={1,2,3,4};
		for(int c:arr) {
			System.out.print(c);
		}
		ArrayList<Integer> b=new ArrayList<>(Arrays.asList(arr));
		System.out.println(b);
		
		ArrayList<String> a=new ArrayList<>(Arrays.asList("a", "b", "c"));
        System.out.println(a);

		ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));
	    System.out.println("ArrayList: " + languages);
}}

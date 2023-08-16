package collection;
import java.util.*;
public class ConvertingArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList<>();
		s.add("java");;
		s.add("python");
		s.add("react");
		s.add("c++");
		System.out.println(s);
		String arr[]=new String[s.size()];
		s.toArray(arr);
		for(String a:arr)
		System.out.print(a);
		
	}

}

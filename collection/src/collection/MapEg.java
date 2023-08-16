package collection;
import java.util.*;
public class MapEg {

	public static void main(String[] args) {
		HashMap<String,Integer> s1=new HashMap<>();
		s1.put("one",1);
		s1.put("two",2);
		s1.put("three",3);
		System.out.println(s1);
		Map<String,Integer> s2=new HashMap<>();
		s2.putAll(s1);
s2.put("four",4);
System.out.println(s2);
s2.putIfAbsent("five",5);
s2.putIfAbsent("three",4);
System.out.println(s2);
s2.remove("three",3);
System.out.println(s2);
System.out.println(s2.containsKey("one"));
System.out.println(s2.containsValue(2));
s2.replace("one",1,11111);
System.out.println(s2);
s1.replaceAll((key,value) -> value*value);
System.out.println(s1);
	}

}

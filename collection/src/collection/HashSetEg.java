package collection;
import java.util.*;
public class HashSetEg {

	public static void main(String[] args) {
		Set<String> s1=new HashSet<>();
		Set<String> s2=new HashSet<>();
s1.add("ram");
s1.add("raj");
s1.add("vijay");
s2.addAll(s1);
System.out.println(s2);
System.out.println(s1.remove(1));
System.out.println(s2.removeAll(s1));
s1.add(null);
System.out.println(s1.containsAll(s2));
System.out.println(s1.contains("ram"));
System.out.println(s1.isEmpty());
//we can also perform union,intersection and subset in Set Interface
      
Set<String> s3=new HashSet<>();
Set<String> s4=new HashSet<>();
s3.add("arun");
s3.add("amul");
s4.add("ramesh");
s4.add("suman");
//union
s3.addAll(s4);
System.out.println(s3);
s3.removeAll(s4);
s4.add("arun");
//intersection
s3.retainAll(s4);
System.out.println(s3);

//subset
System.out.println(s3.containsAll(s4));
s4.add("amul");
System.out.println(s4.containsAll(s3));
}
}

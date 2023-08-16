package collection;
import java.util.*;
public class IteratorEg {
	public static void main(String[] args) {
	LinkedList<String> s=new LinkedList<String>();
	s.add("abc");
	s.add("xyz");
	s.add("efg");
Iterator<String> i=s.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}

System.out.println("--------------------------");

Iterator j=s.descendingIterator();
while(j.hasNext()) {
	System.out.println(j.next());
}
	}
}

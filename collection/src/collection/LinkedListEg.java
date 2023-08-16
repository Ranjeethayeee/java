package collection;
import java.util.*;
public class LinkedListEg {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		l.add("ranju");
		l.add("nivi");
		l.add("sanketh");
		l.add("amma");
		l.add("appa");
		LinkedList<String> list=new LinkedList<String>();
		list.addAll(l);
		System.out.println(list);
		l.add("1234");
		System.out.println(l.remove("appa"));
		l.addFirst("yalpi");                 System.out.println(l);
		l.add("1234");
		System.out.println(l.removeFirst());
		l.addLast("Y");                 System.out.println(l);
		l.removeFirstOccurrence("1234");     System.out.println(l);
	l.clear();	
	System.out.println(l);}

}

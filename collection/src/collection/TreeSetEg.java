package collection;
import java.util.*;
public class TreeSetEg {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>();
		t.add(2);
		t.add(4);
		t.add(6);
		t.add(8);
		TreeSet<Integer> t1 = new TreeSet<>();
		t1.addAll(t);
	System.out.println("remove="+t.remove(4));
	System.out.println("removeall="+t.removeAll(t1));
	
	System.out.println("higher="+t1.higher(4));
	
	System.out.println("lower="+t1.lower(6));
	
	System.out.println("first="+t1.first());
	
	System.out.println("last="+t1.last());
	
		System.out.println("ceiling of 3="+t1.ceiling(3));
		
		System.out.println("floor of 3="+t1.floor(3));
		
	
		System.out.println("headset="+t1.headSet(6));
		
		System.out.println("headset with boolean="+t1.headSet(6,true));
	
		System.out.println("tailset="+t1.tailSet(4));
		
		System.out.println("tailset with boolean="+t1.tailSet(2,true));
		
		System.out.println("subset b/w 2,8"+t1.subSet(2,8));
		
		System.out.println("subset b/w 2 and 4="+t1.subSet(2, true,4,true));
		
		System.out.println("subset b/w 3 and 6 with boolean="+t1.subSet(3,false,6,true));
		
System.out.println("pollFirst="+t1.pollFirst());
		
		System.out.println("pollLast="+t1.pollLast());
		
		
		
	}

}

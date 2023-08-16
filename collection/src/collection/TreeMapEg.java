package collection;
import java.util.*;
public class TreeMapEg {

	public static void main(String[] args) {
	TreeMap<String,Integer> m=new TreeMap<>();
	m.put("one",1);
	m.put("two",2);
	m.put("three",3);
	// here elements are stored like {one,three,two}
	System.out.println("entryset="+m.entrySet());
	System.out.println("values="+m.values());
	System.out.println("keyset="+m.keySet());
	
	System.out.println("firstkey="+m.firstKey());
	System.out.println("firstentry="+m.firstEntry());
	System.out.println("celingkey="+m.ceilingKey("two"));
	System.out.println("m.ceilingEntry="+("three"));
	System.out.println("floorkey="+m.floorKey("three"));
	System.out.println("fllorentry="+m.floorEntry("two"));
	System.out.println("lasrkey="+m.lastKey());
	System.out.println("lastentry="+m.lastEntry());
	
	System.out.println("headmap:"+m.headMap("three"));
	System.out.println("tailmap:"+m.tailMap("two"));
	System.out.println("submap:"+m.subMap("one","three"));
	
	System.out.println(m.pollFirstEntry());
	System.out.println(m.pollLastEntry());
	
	System.out.println(m.get("one"));
	System.out.println(m.getOrDefault("two",2));
	
	
	}

}

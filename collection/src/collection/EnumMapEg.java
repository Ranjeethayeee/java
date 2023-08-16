package collection;
import java.util.*;
enum size{
	medium,large,small}

public class EnumMapEg {

	public static void main(String[] args) {
		Map<size,Integer> m=new EnumMap<>(size.class);
		m.put(size.medium,10);
		m.put(size.large,20);
		m.put(size.small,6);
		
		System.out.println(m.get(size.small));
		System.out.println(m.containsKey(size.large));
		System.out.println(m.containsValue(10));
		m.putIfAbsent(size.small,5);
		System.out.println(m);
		System.out.println(m.entrySet());
			System.out.println(m.keySet());
			System.out.println(m.values());
			System.out.println(m.size());
			
			
			
		
		
		
		
	}

}

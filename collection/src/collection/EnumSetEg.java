package collection;
import java.util.*;
enum Months{
	jan,feb,mar,apr,junre,jul,aug;
}
public class EnumSetEg {

	public static void main(String[] args) {
		Set<Months> m1=EnumSet.allOf(Months.class);
		System.out.println(m1);
		
		Set<Months> m2=EnumSet.noneOf(Months.class);
		System.out.println(m2);
		
		Set<Months> m3=EnumSet.of(Months.apr);
		System.out.println(m3);
		
		Set<Months> m4=EnumSet.of(Months.mar,Months.jul);
		System.out.println(m4);
		
		Set<Months> m5=EnumSet.range(Months.jan,Months.jul);
		System.out.println(m5);
		 
		m2.add(Months.jan);
		System.out.println(m2);
		
		m3.addAll(m2);
		System.out.println(m3);
		
		System.out.println(m1.contains(Months.jan));
		
		m3.clear();
		System.out.println(m3);
		
		m1.isEmpty();
		System.out.println(m1);
		
	Iterator<Months> m=m1.iterator();
	while(m.hasNext()) {
		System.out.print(m.next()+" ");
	}
		
		System.out.println(m1.size());
	}

}

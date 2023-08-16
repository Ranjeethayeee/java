package collection;
import java.util.*;
public class ArrayListMethodsEg {
	public static void main(String[] args) {
		ArrayList <Integer> n= new ArrayList<>();
		ArrayList <Integer> num= new ArrayList<>();
		n.add(1);
		n.add(4);
		n.add(6);
		n.add(9);
        n.add(10);
        num.addAll(n);
        System.out.println(num);
		num.add(1);
		num.add(5,12);
		System.out.println(num);
		System.out.println(num.get(4));
		System.out.println(num.remove(2));
		System.out.println(num.contains(1));
	System.out.println(	num.clone());
	n.sort(Comparator.naturalOrder());
	System.out.println(n);
	n.sort(Comparator.reverseOrder());
	System.out.println(n);
	System.out.println(num.clone());

	ArrayList<Integer> s=(ArrayList<Integer>)n.clone();
		System.out.println(s);
		System.out.println(n.subList(0,2));
		n.clear();	System.out.println(n);
		//Accessing arrayList Elements
		for(Integer a:num)
		{
			System.out.print(a+" ");
		}
	}}
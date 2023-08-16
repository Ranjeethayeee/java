package collection;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
public class AddMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int i=sc.nextInt();
		ArrayList l=new ArrayList();
		l.add("ram");
		l.add(Boolean.TRUE)		;
		l.add("sita");
		l.add(s+" "+i);
System.out.println(l);
ArrayList<Integer> l1=new ArrayList<>();
l1.add(0,11);
System.out.println(l1);
List<String> l2=  new ArrayList<>(12);
l2.add("Ranjeetha");
l2.add(0,"Y");
System.out.println(l2);
}

}

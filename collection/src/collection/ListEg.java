package collection;
import java.util.*;
public class ListEg {

	public static void main(String[] args) {
		String arr[]= {"ranju","nuvi","sanketh"};
		List<String> l=new ArrayList<>();
		//Converting array to list
		for(String s:arr) {
			l.add(s);
		}
		
		System.out.println(l);
		//Converting list to array
		String arr2[]=new String[l.size()];
			l.toArray(arr2);
			for(String s2:arr2) {
		System.out.print(s2+" ");}
			
			//sorting the list elements
			System.out.println();
			List<Integer> i=new ArrayList<Integer>();
			i.add(1);
			i.add(4);
			i.add(2);
		Collections.sort(i); 
			for(Integer s3:i)
			{
				System.out.print(s3+" ");
			}
		}
	
}

package oops;
import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev="";
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		if(rev.equalsIgnoreCase(s2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println(" NOt Anagram"+rev);
		}
		
	}
}

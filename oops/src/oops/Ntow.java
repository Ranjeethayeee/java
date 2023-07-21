package oops;
import java.util.Scanner;
public class Ntow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number from 1-5");
		String num=sc.next();
	for(int i=0;i<num.length();i++) {
		switch(num.charAt(i))
		{
		case '1':System.out.println("one");
		break;
		case '2':System.out.println("two");break;
		case '3':System.out.println("three");break;
		case '4':System.out.println("four");break;
		case '5':System.out.println("five");
		}}
		
	}	

}

import java.util.*;
public class StudentArr {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of students=");	
		int[] a=new int[sc.nextInt()];
	int i=0;
		for( i=0;i<a.length;i++) {
			a[i]=sc.nextInt();}
		for(int age:a)
			System.out.println(age);
	}}

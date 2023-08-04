
public class Eg1 {

	public static void main(String[] args) {
		try {
			int x=100/0;}
		catch(ArithmeticException e1) {	
		System.out.println(e1);
		}
		try {
			int a[]= {1,2,3,4};
			System.out.println(a[10]);}
		catch(ArrayIndexOutOfBoundsException e2) {
		System.out.println(e2);
		}
		
		try {	String s="hgjh";
			int i=Integer.parseInt(s);
			System.out.println(i);}
		catch(NumberFormatException e3)
		{
		System.out.println(e3);}
		
		try {String n=null;	
		System.out.println(n.length());
		}catch(NullPointerException e4)
		{
		System.out.println(e4);
		}
		
		
		System.out.println("---------");
	}

}

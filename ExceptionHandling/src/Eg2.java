
public class Eg2 {

	public static void main(String[] args) {
	try {
		try{  
		    int a[]=new int[5];  
		    a[5]=30/0;  }catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("task 1 completed");} 
		try {
		int x=78/0;
		}catch(ArithmeticException e)
		{System.out.println("task1 2 completed");}
		} 
	catch(Exception e) {
		System.out.println("parent catch block will be exicuted if no properExceptrion is found ");}
	}
}

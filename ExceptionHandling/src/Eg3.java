
public class Eg3 {

	public static void main(String[] args) {
		try {
			try {
				int[] z= {0};
				String s=null;
				System.out.println(z.length);
				try {
					int a=90/0;
				}catch(ArrayIndexOutOfBoundsException e1) {
					System.out.println(e1);}
				catch(ArithmeticException e2) {
					System.out.println(e2);}}
			catch(NullPointerException e3) {
				System.out.println(e3);
			}}
				catch(Exception e) {
				System.out.println("Exception not match");}
				}
			}
	

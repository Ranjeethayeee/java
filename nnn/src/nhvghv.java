import java.util.Scanner;
public class nhvghv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	String nation=s.next();
		int age=s.nextInt();
		System.out.println("nationality="+nation);
		System.out.println("age="+age);
		
		if(nation.equalsIgnoreCase("indian"))
		{
			if(age>=18)
			{
				System.out.println("Eligible to vote");
			}
		}
		else
System.out.println("Not eligible");
	}

}

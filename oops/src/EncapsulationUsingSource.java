import java.util.Scanner;
class D{
	 private String name;
	private int age;
	private String address;
	public void  setDetails(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	
}
public class EncapsulationUsingSource {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		D ob=new D();
		ob.setDetails(s.next(),s.nextInt(),s.next());
System.out.println(ob.getName()+" "+ob.getAge()+" "+ob.getAddress());
	}

}

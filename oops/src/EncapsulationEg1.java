 import java.util.Scanner;
class A{
	 private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
 }
public class EncapsulationEg1 {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		A obj =new A();
		obj.setName(S.nextLine());
System.out.println(obj.getName());
	}

}

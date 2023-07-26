//Example of read only 
class B{
	private String name="abc";
	public String getName()
	{
		return name;
	}
}
//Example of write only 
class C{
	private String college;
	public void setCollege(String college)
	{
		this.college=college;
	}
}

public class EncapsulationEg2 {

	public static void main(String[] args) {
B obj1 =new B();
C obj2=new C();
//obj.setName("xyz");      read only example
//obj2.getCollge(); Write only example
System.out.println(obj1.getName());
obj2.setCollege("xyz");
	}
}

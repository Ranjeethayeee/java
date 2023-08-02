
public class ThisEg1 {
	int usn;
	String name;
	String course;
	public ThisEg1(int usn,String name,String course)
	{
		this.usn=usn;
		this.name=name;
		this.course=course;
		System.out.print(usn+" "+name+" "+ course);
	}
	public ThisEg1(int usn,String name,String course,int fee)
	{
		this(usn,name,course);
		System.out.println(" "+fee);
	}
	public static void main(String[] args) {
		ThisEg1 obj1=new ThisEg1(01,"abc","eee",10000);
		ThisEg1 obj2=new ThisEg1(02,"xyz","eee");
	}

}

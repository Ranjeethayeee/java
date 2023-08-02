
public class Student {
int rollno;
String name;
	public Student(int r,String n) {
		rollno=r;
		name=n;
	}
	public String toString()
	{
		return rollno+name;
	}

	public static void main(String[] args) {
		Student s=new Student(01,"abc");
		//without toString(),compiler atomaticaly calls
System.out.println(s);
//System.out.println(s.toString());

	}

}

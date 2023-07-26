
public class StaticEg1 {
int USN;
String name;
static String college;
 public StaticEg1(int u,String n) {
	 USN=u;
	 name=n;
 }
 void display() {
	 System.out.println(USN+" "+name+" "+college);
 }
	public static void main(String[] args) {
		StaticEg1  ob=new StaticEg1(19,"ranju");
		college="xyz";
ob.display();
	}

}

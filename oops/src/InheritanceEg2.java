class Emp{
	String name;
	int usn;
	add ad;
	public Emp(String name,int usn,add ad)
	{
		this.name=name;
		this.usn=usn;this.ad=ad;
	}
	void empDisplay() {
		System.out.println(name+" "+usn);
		System.out.println(ad.city+" "+ad.state);
}}
class add{
	String city;
	String state;
	public add(String city,String state) {
		this.city=city;
		this.state=state;
	}}
public class InheritanceEg2 {

	public static void main(String[] args) {
		add x=new add("bellary","karnataka");
		Emp a=new Emp("ranju",01,x);
		//x.adddisplay();
		a.empDisplay();}
}

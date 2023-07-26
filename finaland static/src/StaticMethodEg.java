
public class StaticMethodEg {
	static String city="Bellary";
	final int wardNo=2;
	int totalNo;
int houseNo;

private int getTotalNo() {
	return totalNo;
}
private void setTotalNo(int totalNo) {
	this.totalNo = totalNo;
}
private int getHouseNo() {
	return houseNo;
}
private void setHouseNo(int houseNo) {
	this.houseNo = houseNo;
}
public void display()
{
	System.out.println("city="+city+" "+"wardNo="+wardNo);
}
@Override
public String toString() {
	return " wardNo=" + wardNo + ", totalNo=" + totalNo ;
}
public static void main(String[] args)
{
	StaticMethodEg s1=new StaticMethodEg();
s1.setTotalNo(8);
s1.setHouseNo(425);
 s1.toString();
 System.out.print(" "+s1);
 s1.display();
}}

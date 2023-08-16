package collection;
import java.util.*;
enum days{
	mon,tues,wed,thurs,fri,sat,sun
}
class EnumEg {
	days d;
public EnumEg(days d) {
	this.d=d;
	System.out.println(d);
}
public void dayname() {
	switch(d) {
	case mon:System.out.println("MONDAY");
	break;
	case tues:System.out.println("TUESDAY");
	break;
	case wed:System.out.println("WEDNESDAY");
	break;
	case thurs:System.out.println("THURSDAY");
	break;
	case fri:System.out.println("FRIDAY");
	break;
	case sat:System.out.println("SATDAY");
	break;
	case sun:System.out.println("SUNNDAY");
	}
}}
class Enum{
	public static void main(String[] args) {
		EnumEg obj1=new EnumEg(days.mon);
		EnumEg obj2=new EnumEg(days.sat);
	obj1.dayname();
	obj2.dayname();
	}

}

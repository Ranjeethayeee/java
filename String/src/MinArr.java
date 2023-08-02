class A{
	public static int  min(int[] m) {
		int value=m[0];
		for(int i=1;i<m.length;i++) {
		if(value>m[i]) 
			value=m[i];
		System.out.println(value);}
			return value;
	}}
public class MinArr {
	public static void main(String[] args) {
		int[] a=new int[]{6,2,3,4,5};
System.out.println(A.min(a));
	}

}

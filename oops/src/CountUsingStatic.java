
public class CountUsingStatic {
int c;
static int count;
	public CountUsingStatic(int c) {
		this.c=c;
		c++;
		System.out.println(c);
	}
	public CountUsingStatic() {
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		CountUsingStatic c1=new CountUsingStatic(0);
		CountUsingStatic c3=new CountUsingStatic(0);
		// new memory is created for every object(c1,c2)
		CountUsingStatic c2=new CountUsingStatic();
		CountUsingStatic c4=new CountUsingStatic();
		// only once memory is created for object(c2,c4);
	}

}

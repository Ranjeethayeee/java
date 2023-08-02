
public class ThisEg {
	ThisEg(){
		System.out.println(" Hello ");
	}
	ThisEg(int z){
		this();
		System.out.println(" welcome "+z);
	}
	public static void main(String[] args) {
		ThisEg obj=new ThisEg(10);
	}

}

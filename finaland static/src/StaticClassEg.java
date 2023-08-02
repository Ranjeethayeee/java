
class StaticClassEg {
	String name;
	String branch;
	int cgpa;
static int batchNo=69;
	 StaticClassEg(String n,String b,int cg) {
		name=n;
		branch =b;
		cgpa=cg;
	}
	public void display()
	 {
		 System.out.println(name+" "+branch+" "+cgpa+" "+StaticClassEg.batchNo);
	 }

	public static void main(String[] args) {
		StaticClass s1=new StaticClass("abc","eee",89);
		s1.display();
//System.out.println(StaticClass.batchNo);
	}
}


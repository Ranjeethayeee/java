
public class AnonamousArr {
public static void arr1(int[] a) {
	for(int value:a) {
		System.out.println(value+"\t");
	}}
	public static void arr2(int[][] b) {
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
			System.out.print(b[i][j]+"\t");	
	}}}
	public static void main(String[] args) {
		 AnonamousArr.arr1(new int[] {1,2,3,4});
		 System.out.println("---------------------");
		 AnonamousArr.arr2(new int[][] {{1,2,3,4},{5,6,7,8,9}});
	}

}

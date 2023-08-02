import java.util.Scanner;
public class Regular3DArr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Students");
		int std=sc.nextInt();
		int[][][] arr=new int[2][2][std];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					arr[i][j][k]=sc.nextInt();
					}}}
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					for(int k=0;k<arr[i][j].length;k++) {
			System.out.print(arr[i][j][k]+" ");}
			System.out.println();}
		}
	}

}

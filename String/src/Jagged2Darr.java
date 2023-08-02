import java.util.Scanner;
public class Jagged2Darr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[2][];
		//first row with 3 column
		arr[0]=new int[3];
		//second row with 2 column
		arr[1]=new int[2];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
System.out.println();}
	}
}

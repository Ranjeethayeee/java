import java.util.Scanner;
public class ar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] arr= new int[size];
		for (int j=0;j<arr.length
;j++) {
			
			arr[j]=s.nextInt();
		}
		if(arr[0]==arr[1])
			System.out.println("same");
			}

}

import java.util.*;
public class concatenation {

	public static void main(String[] args) {
		String s1="hello";
		String s2="world";
		String s3=s1.concat(s2);
		System.out.println(s3);
		
		StringBuilder sb1=new StringBuilder("hello");
		StringBuilder sb2=new StringBuilder("welcome");
		StringBuilder sb3=sb1.append(sb2);
		System.out.println(sb3.toString());
		
		String sc1=new String("java");
		String sc2=new String("script");
		String s=String.join("",sc1,sc2);
		String sf=String.format("%s %s",sc1,sc2);
		System.out.println(s);
		System.out.println(sf);
		
		StringJoiner sj = new StringJoiner(" ","[","]");   
        sj.add("Hello");    
        sj.add("World");   
        System.out.println(sj.toString());
	}

}

package collection;
import java.util.*;
public class HashMapEg {

	public static void main(String[] args) {
		Map<String,String> m=new HashMap<>();
		m.put("KA","Karnatka");
		m.put("AP", "Andrapradesh");
		m.put("BR","Bihar" );
		m.put("TM","Tamilnadu");
		System.out.println(m);
		m.putIfAbsent("MH","Maharastra");
		System.out.println(m);
		
		System.out.println("get="+m.get("KA"));
		System.out.println("getOrDefault="+m.getOrDefault("AP","Andrapradesh"));

		System.out.println("containsKey="+m.containsKey("TM"));
		System.out.println("containsValue="+m.containsValue("Karnatka"));
		System.out.println("containsValue="+m.containsKey("TM"));
		
		System.out.println(	m.replace("KA","karnataka"));
		System.out.println(m.replace("BR","Bihar","biharrrrr"));
		
		System.out.println("remove="+m.remove("MH"));
		
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
	}

}

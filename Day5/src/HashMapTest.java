import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Jon Snow");
		map.put(2,"Tyrion Lannister");
		map.put(3, "Ned Stark");
		map.put(1, "Ned Stark");
		map.put(6, "Tyrion Lannister");
		
		System.out.println(map);
		System.out.println(map.keySet());
		
	}
}

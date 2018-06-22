import java.util.ArrayList;
import java.util.List;
public class GenericList1 {

	public static void main(String[] args) {
	
		List<String> data = new ArrayList();
		data.add("Arya Stark");
		data.add("Cersei Lannister");
		System.out.println(data.get(0).toUpperCase());
		
		
	}

}

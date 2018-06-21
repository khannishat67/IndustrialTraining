import java.util.ArrayList;
import java.util.List;
public class ListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List data = new ArrayList();
		data.add("Ehllo");
		data.add(007);
		data.add(6.9f);
		data.add(false);
		
		
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i));
			
		}
	}

}

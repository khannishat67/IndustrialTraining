import java.util.PriorityQueue;

public class PriorityTest {
	public static void main(String[] args) {
		PriorityQueue<String> pr = new PriorityQueue<>();
		pr.add("KHan");
		pr.add("Nishat");
		pr.add("Decide Something");
		System.out.println(pr.peek());
		pr.forEach(System.out::println);
	}
}

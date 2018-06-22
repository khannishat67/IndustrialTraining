import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DistinctWords {

	public static void main(String[] args) {
		String str = " In this one, we think we've  reached the main verb when we get to \" raced ,\" but instead we are still inside a reduced relative clause. Reduced relative clauses let us say, \" the speech that was given this morning.\" Or, in this case,\" the horse raced past the barn\" instead of\" the horse that was raced past the barn.";
		HashSet<String> hs = new HashSet<>();
		List<String> words = Arrays.asList(str.split(" " ));
		/*for(String s : words) {
			hs.add(s);
		} */
		words.forEach(hs::add);
		
		
		hs.forEach(System.out::println);
	}

}

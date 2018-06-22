import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		String sentence = "hello world this is hello world";
		
		String[] words = sentence.split(" ");
		 for(String word : words) {
			 if(map.containsKey(word))
				 map.put(word,map.get(word)+1 );
			 else
				 map.put(word, 1);
			 
		 }
		 System.out.println(map);

	}

}

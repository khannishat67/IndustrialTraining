
public class StringTest {
	public static void main(String args[]) {
		String str,str2;
		str = "Hello";
		str2 = "Hell";
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		str2 = str2+'o';
		System.out.println(str2.hashCode());
		
	
	}
}

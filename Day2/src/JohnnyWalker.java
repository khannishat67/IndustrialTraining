
public class JohnnyWalker {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder();
		for(int i=1;i<=100;i++) {
			if(i%3==0)
				s.append("Johnny");
			if(i%5==0)
				s.append("Walker");
			if(i%3 != 0 && i%5 !=0)
				System.out.println(i);
			else {
				System.out.println(s.toString());
				s.delete(0, s.capacity());
			}
		}

	}

}

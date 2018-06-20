class Student2 {
	
	private static Student2 obj;
	private Student2() {
		

	}
	public static Student2 getInstance() {
		if(obj==null)
			 obj = new Student2();
		
		
		return obj;
	}

}
public class StudentTest2 {

	public static void main(String[] args) {
		Student2 obj = Student2.getInstance();
		System.out.println(obj.hashCode());
		Student2 obj2 = Student2.getInstance();
		System.out.println(obj2.hashCode());

	}

}

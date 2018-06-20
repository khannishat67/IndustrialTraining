
class Student {
	private static Student obj=new Student();
	private Student() {
		

	}
	public static Student getInstance() {
		return obj;
	}

}
class StudentTest{
	public static void main(String args[]) {
		Student obj = Student.getInstance();
		System.out.println(obj.hashCode());
		Student obj2 = Student.getInstance();
		System.out.println(obj2.hashCode());
	 
	}
}

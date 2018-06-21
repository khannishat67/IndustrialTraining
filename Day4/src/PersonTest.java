
public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("Nishat","Khan",20);
		System.out.println(p1.toString());
	}

}
class Person{
	String fname;
	String lname;
	int age;
	public Person(String fname,String lname,int age) {
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
	}
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		Person that = (Person)(arg0);
		if(this.fname.equals(that.fname)) {
			return true;
		}
		return false;
	}
	
	
}

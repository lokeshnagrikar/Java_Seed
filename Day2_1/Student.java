package Day2_1;

public class Student {
	private String name,email;
	private int age ;

	public void setName(String s) {
		name = s;
	}

	public String getName() {
		return name;
	}

	public void setAge(int a) {
		age = a;
	}

	public int getAge() {
		return age;
	}
	public void setEmail(String e) {
		email = e;
	}

	public String getEmail() {
		return email;
	}
	public static void main(String args[]) {

		Student st = new Student();
		st.setName("rahul");
		System.out.println("\nName : " + st.getName());
		st.setAge(24);
		System.out.println("Age : " + st.getAge());
		st.setEmail("rahulk@gmail.com");
        System.out.println("Email : " +st.getEmail());

	}// end main
}// end class

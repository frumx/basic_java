package ABSTRACT1;

public class Student extends Person {
	private String school;

	@Override
	public String toString() {
		return super.toString() + school;
	}

	public Student(String name, String surname, String school) {
		super(name, surname);
		this.setSchool(school);
	}

	@Override
	public void rest() {
		System.out.println("Ide na wagary");

	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

}

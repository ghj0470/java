package test052;

public class Student {
	
	private String clazz;
	private String name;
	private int grade;

	public void setFont(String clazz) {
		this.clazz = clazz;
	}

	public void setDont(String name) {
		this.name = name;
	}

	public void setWont(int grade) {
		this.grade = grade;
	}

	public void printInfo() {
		System.out.println(grade);
		System.out.println(clazz);
		System.out.println(name);
	}
}
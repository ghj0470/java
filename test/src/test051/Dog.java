package test051;

public class Dog {
	private String name;
	private int age;
	
	public void setInfo(int age, String name) {
		this.name = name;
		this.age = age;
		
	}
	
	public void printInfo() {
		
		
		System.out.println("이 강아지의 이름은 " + name);
		System.out.println("이 강아지의 나이는 " + age);
	}

}

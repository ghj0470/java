package test05;

public class Person {
	String name;
	int age;

	void sleep() {
		System.out.println(this.name + "님이 주무십니다.");

	}

	int getAge() {
		return age; // age앞에 this가 생략
	}

}

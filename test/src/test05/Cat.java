package test05;

public class Cat {
	public String name; //접근제어자가 public 이여서 접근가능
	private int age;
	String type; //타입이라는 변수는 다른 패키지에서 접근불가
	
	public void setAge(int age) {
		this.age = age;
		System.out.println(name + "고양이의 나이는" + this.age);
	}

}

package test05; 

public class Exec {

	public static void main(String[] args) {
//		Person p = new Person();
//		p.name = "홍길동";
//		p.age =30;
//		p.sleep();
//		int a = p.getAge();
//		System.out.println(p.name + "님의 나이는" + a);
//		2.p = new Person();
//			2.	p.name = "홍길동";
        Cat c = new Cat(); //모두 public >  protected > 패키지 default > 클래스 private 접근자의 범위
        c.name = "동동이";
        c.type = "삼";
        c.setAge(6);
	
	
	}

}

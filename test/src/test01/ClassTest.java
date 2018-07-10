package test01;

public class ClassTest {
	String name;
	int count;
	
	void test() {
		System.out.println(this.name);
	}
	void test1() {
		System.out.println(this.count);
		
	}

	public static void main(String[] args) {
		ClassTest ct1 = new ClassTest();
		ct1.count = 3;
		ClassTest ct2 = new ClassTest();
		ct2.test1();
		
		
	}

}

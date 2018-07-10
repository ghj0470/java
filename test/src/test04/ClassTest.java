package test04;

public class ClassTest {
	int num;
	String str;

	public void test() {
		System.out.println(num); // 스테틱이있으면 위치를 정확히 안찍어 줘도된다.  2.num에 this가 생략됨
	}

	public static void test01() {
		System.out.println("전 누구건가요?");// 위에 주석의 예시
	}

	public static void main(String[] args) {
		ClassTest classTest = new ClassTest();
		System.out.println(classTest.num);
		classTest.test();
		(new ClassTest()).num = 10;
		test01();// 예시

	}

}

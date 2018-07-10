package test04;

public class OverloadingTest {
	int a = 3;
	public void test() {
		
	}
	public int test(int a) {
		return 0;
		
	}                       
	public int test(String a) {
		return 0;
	}
	public void test(int a, String b) { //1번 1번과 2번은 둘은 명확하게 다르다.
	} 
	public void test(String b ,int a) { // 2번
	}

//static void printsome
	
	
//	public void test() {
//		
//	}
//	public int test() {
//		
//	}                           //데이터 타입이 달라도 함수가 같으면 안된다

	public static void main(String[] args) {
		OverloadingTest ot = new OverloadingTest();
		ot.a = 10;
		ot.test();
		ot.test(2);
		ot.test("안녕");

	}

}

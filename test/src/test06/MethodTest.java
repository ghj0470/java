package test06;

public class MethodTest { //오버로딩 오버라이딩은 상속 o 오버로딩은 상속x

	public void print() {
		System.out.println("프린트 함수");
	}

	public void print(int a) {
		System.out.println("인트 프린트 함수");
	}

	public void print(String a) {
		System.out.println("스트링 프린트 함수");
	}

	public void print(String a, int b) {
		System.out.println("오버로딩 프린트 함수");
	}

	public void print(int a, String b) {
		System.out.println("같은걸 순서만 바꿔서 프린트 함수");
	}

	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		mt.print();
		mt.print(1);// 정수를 넣었기때문에
		// mt.print(int a); 요건 안됨
		mt.print("안녕하셍");
		mt.print(40);

	}
}

package test06;

public class PrintObject {
	String str = "postr";
	
	public String toString() {
		return "이 변수는 str이란 변수는" + str + "이라는 값을 가지고 있죠"; //상속 + 오버라이딩
	}
	public static void main(String[] args) {
		String str = "str";
		System.out.println(str);
		PrintObject po = new PrintObject();
		System.out.println(po.str);
		System.out.println(po);
	}

}

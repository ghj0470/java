package test06;

public class Son extends Father{
	
	void work() { //void work(int a) 이런식으로 선언을해도 실행이 가능하다.
		          //※그 이유는 선언하는순간 다른객체가 되기때문이다.
		
		//private void work()를 선언할시 오류가뜬다. 아버지가 디폴트이여도
		//※아버지에 퍼블릭과 프로텍트가 쓰이면 오류가 x
		System.out.println("난 개발일을 하자~");
	}

//	public String work() {  아버지가 보이드면 보이드 스트링이면 스트링을 써야된다
//		return "abc";
//	}
	String work(String a) { //3 상속 + 오버라이딩
		return"abc";
	}
	
	public static void main(String[] args) {
		Son s = new Son();
		s.work();
		String s1 = s.work("abc"); //3
		System.out.println(s1);
		System.out.println(s.work("abc"));
		String s2 = "abc";
		
	}

}

package test04;

public class FuncTest {

	public void add(int a, int b) {
		System.out.println("인트더하기 : " + a + b);
	}

	public void add(long a, long b) {
		System.out.println("롱 더하기 : " + a + b);
	}

	public static void main(String[] args) {
		FuncTest ft = new FuncTest(); //위에것과 연결 어디에있는지 알려주는것 =FuncTest ft; ft =  new FuncTest(); <-이것도 가능 
		ft.add(2, 4);
		long a = 456456; // = ft.add(456456l, 123123l); 
		long b = 123123;
		ft.add(a, b);
	}

}

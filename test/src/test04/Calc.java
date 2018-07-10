package test04;

public class Calc {//카큘레이터 의 약자
//	더하기 add()
//	빼기 minus()
//	곱하기 multiple()
//	나누기 divide()
	
	public void add(int a, int b) {
		System.out.println(a + b);
	}
	public void minus(int a, int b) {
		System.out.println(a - b);
	}
	public void multiple(int a, int b) {
		System.out.println(a * b);
	}
	public void divide(int a, int b) {
		System.out.println(a / b);
	}
	public void Calc(String op, int num1, int num2) {
		if(op.equals("+")) {
			add(num1,num2);
		}
	}
	
	
	public static void main (String[] args) {
	Calc cl = new Calc();
	int a = 20;
	int b = 5;
	cl.add(a, b);
	cl.minus(a, b);
	cl.multiple(a, b);
	cl.divide(a, b);
	}

}

package test051;

public class Test {
	
	private int num = 3; //초기값은 3
	
	public void setNum(int num) { //현재 num은 20이다
		this.num = num;   //그 초기값을 현재num으로 대입
	}
	public void printNum() {
		System.out.println(num); //구역은 다르지만 이미 초기값은 20이 되었기에 3이 아니라 20이나온다
	}

}

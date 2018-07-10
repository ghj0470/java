package test052;

public class Car {
	private int speed;
	private String name;
	private String company;
	
	public void setInfo( int speed,String name, String company) {
		this.speed =speed;
		this.company = company;
		this.name = name;
	}
	
	public void printInfo() {
		System.out.println("자동차의 최대속력 : " + speed );
		System.out.println("자동차의 모델명 : " + name );
		System.out.println("모델 출시 회사 : "+ company );
		
	}
}


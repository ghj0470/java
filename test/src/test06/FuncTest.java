package test06;

public class FuncTest { //Func 펑션을 썻을때
	
	public void printLoop(int start,int end) {
		for(int i=start; i<=end; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		FuncTest ft = new FuncTest();
		ft.printLoop(1,10);
		ft.printLoop(3,12);
		ft.printLoop(100,120);
		
		
		
		
		
	}

}

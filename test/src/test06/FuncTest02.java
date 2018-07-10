package test06;

public class FuncTest02 {
	
	public void printLoopAnt(int start,int end) {
		for(int i=start; i<=end; i++) {
			System.out.println(i);
		}
	}

	public void printLoop(int start,int end) {
		for(int i=end; i>=start; i--) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		FuncTest02 ft = new FuncTest02();
		ft.printLoop(80,100);
		
		
	}

}

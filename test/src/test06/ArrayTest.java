package test06;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 1부터 5까지 중 1개를 입력해 주세요");
		String numStr = scan.nextLine();
		int num  = Integer.parseInt(numStr);
		if(num==1) {
			System.out.println("당신은 나서는걸 좋아하는 타입이군요!");
		}
		else if(num==2) {
			System.out.println("당신은 자는걸 좋아하는 타입이군요!");
		}
		else if(num==3) {
			System.out.println("당신은 숨쉬는걸 좋아하는 타입이군요!");
		}
		else if(num==4) {
			System.out.println("당신은 삶을 좋아하는 타입이군요!");
		}
		else if(num==5) {
			System.out.println("당신은 사는걸 좋아하는 타입이군요!");
		}
		else {
			System.out.println("1~5가 아니네요?");	
		}
		System.out.println("니가 입력한 숫자 : " +numStr);
	
	}
}

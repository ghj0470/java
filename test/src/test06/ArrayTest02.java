package test06;

import java.util.Scanner;

public class ArrayTest02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 1부터 5까지 중 1개를 입력해 주세요");
		String numStr = scan.nextLine();
		int num = Integer.parseInt(numStr);
		int[] arr = new int[5];
		 for (int t = 0; num < arr.length;) {
			if (num == 1) {
			System.out.println("당신은 나서는걸 좋아하는 타입이군요!");
		} else if (num == 2) {
			System.out.println("당신은 자는걸 좋아하는 타입이군요!");
		} else if (num == 3) {
			System.out.println("당신은 숨쉬는걸 좋아하는 타입이군요!");
		} else if (num == 4) {
			System.out.println("당신은 삶을 좋아하는 타입이군요!");
		} else if (num == 5) {
			System.out.println("당신은 사는걸 좋아하는 타입이군요!");
			
			
		} else
			 while (!scan.hasNextDouble()) {
			      scan.next(); // 잘못된 입력 값 버리기
			      System.err.print("에러! 다시 입력바랍니다: ");
			    }{
		

		System.out.println("니가 입력한 숫자 : " + numStr);
			}
		}
	}
}

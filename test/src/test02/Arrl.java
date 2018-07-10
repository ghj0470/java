package test02;

import java.util.Scanner; // 누군가에게 입력을 받는값

public class Arrl {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("1번값 : ");
		String startNum = scan.nextLine();
		System.out.print("2번값 : ");
		String midNum = scan.nextLine();
		System.out.print("3번값 : ");
		String endNum = scan.nextLine();

		int sNum = Integer.parseInt(startNum);
		int mNum = Integer.parseInt(midNum);
		int eNum = Integer.parseInt(endNum);

		if (sNum < eNum) {
			int tmp = sNum;
			sNum = eNum;
			eNum = tmp;
		}
		if (mNum < sNum) {
			int tmp = mNum;
			mNum = sNum;
			sNum = tmp;

		}

	}
}
// arrNum 의 0번째 방에 10을 넣은것 ※0,1,2,3,4 의
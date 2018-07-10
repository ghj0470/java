package test02;

import java.util.Scanner; // 누군가에게 입력을 받는값

public class Condition {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("시작값을 정해주세요 : ");
		String startNum = scan.nextLine();
		System.out.print("종료값을 정해주세요 : ");
		String endNum = scan.nextLine();

//		System.out.println("start : " + startNum + " end : %s" + endNum);
//		scan.close();                                                     //여기까지 = 시작 종료값만  나오게 하는 식
		int sNum= Integer.parseInt(startNum);
		int eNum= Integer.parseInt(endNum);
		
		if(sNum>eNum) {
			int tmp = sNum;
			sNum = eNum;
			eNum = tmp; //tmp임시적 , 저장 이 문장은 끝자리가 앞자리보다 작은걸 바꿔주는 식
		}
		
		for(int i=sNum; i<=eNum; i++) {
			System.out.println(i);
		}
		scan.close();// if문
	}
}
package test02;

public class SortTest02 {

	public static void main(String[] args) {
		int size = 10;
		int[] arrNum = new int[size];
		arrNum[0] = 10;
		arrNum[1] = 20;
		arrNum[2] = 70;
		arrNum[3] = 50;
		arrNum[4] = 40;

		for (int i = 0; i < arrNum.length; i++)
			if (arrNum[i] % 20 == 0 && arrNum[i] != 0) { // && arrNum[i] ! = 0 을 넣은 이유는 int[] arrNum =new int[size] 가
															// 있어서 방이 추가로 0을 출력

				// length 물어보는 식 ,문자의 개수 ※현재는 방 갯수를 물어보는 식

				System.out.println(arrNum[i]);
				// arrNum 의 0번째 방에 10을 넣은것 ※0,1,2,3,4 의 방에 10을 넣은게 아님
			}

		String[] arrStr = new String[5]; // string 에도 방을 만들수있음
		arrStr[0] = "a";
		arrStr[1] = "b";
		arrStr[2] = "c";
		arrStr[3] = "d";
		arrStr[4] = "e";

		for (int a = 0; a < arrStr.length; a++) {
			System.out.println(arrStr[a]);

		}
		String str = "a,b,c,d,e";
		String[] arrStr01 = str.split(",");  //str이 가지고있는 무언가도  arrStr의 배열변수로 만들었다!
		for (int i = 0; i < arrStr01.length; i++) {
			System.out.println(arrStr01[i]);

			// String str1 = ""; //빈문자 값이 있음
			// String str2 = null; //값이 없음
		}
	}
}
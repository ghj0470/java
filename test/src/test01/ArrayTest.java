package test01;

public class ArrayTest {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		System.out.println(arr[0]); // 여기선 1이 나오지만
		arr = new int[3];
		System.out.println(arr[0]); // 초기화 되서 0이나온

	}
}

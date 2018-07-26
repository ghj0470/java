package subtest01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//6. 파라미터로 임의의 값이 들어있는 정수형 배열을 받아 최대값을 리턴해주는 메소드를 작성해주세요.
//파라미터로 받아 합을 리턴하는 메소드를 작성해주세요.
public class sss {

	public static void main(String[] args) {
		String [] arr = new String[5];
		arr[0] = ;
		arr[1] = ;
		arr[2] = 8;
		arr[3] = 30;
		arr[4] = 20;
		int min = 0;
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				min = arr[0];
				max = arr[0];
			}else {
				
				if(max<arr[i]) {
					max = arr[i];
				}
			}
		}
	
		System.out.println(max);
	
		
	}
}

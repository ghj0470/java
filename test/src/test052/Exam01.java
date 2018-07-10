package test052;

public class Exam01 {
	public static void main(String[] args) {
		for(int i=0; i<=10;) {
			if (i%2==0) {
				i++;
				continue;
			}
			System.out.println(i++);
		}
	}

}

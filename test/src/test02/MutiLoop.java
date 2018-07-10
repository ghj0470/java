package test02;

public class MutiLoop {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println();
			for (int l = 1; l < 10; l++)
				System.out.println(i + "x" + l + "=" + (i * l));
		}
	}

}

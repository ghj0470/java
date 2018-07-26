package subtest01;

public class ddd extends sss{

		@Override
		public void run() {
			System.out.println("내가 달립니다.");
		}

		public static void main(String[] args) {
			sss f = new ddd();
			f.run();
	 
			sss f2 = new sss();
			f2.run();
		}

	} 



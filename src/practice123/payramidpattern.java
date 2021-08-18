package practice123;

public class payramidpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {

			// System.out.print(" ");

			for (int j = 5-i; j >1; j--) {
				System.out.print(" ");//increase 1 more space for tringle 
				}
				for (int j2 = 0; j2 <= i; j2++) {
					System.out.print("* ");

				}
				System.out.println();
			}
           
		}
	}



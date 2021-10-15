package Javaoops;

public class MaxnuminMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ab[][] = { { 9, 3, 4 }, { 3, 6, 7 }, { 7, 8, 2 } };
		int max = ab[0][0];

		for (int i = 0; i < ab.length; i++) {

			for (int j = 0; j < ab.length; j++) {

				if (ab[i][j] > max) {

					max = ab[i][j];

				}

			}
		}
		System.out.println(max);
	}

}

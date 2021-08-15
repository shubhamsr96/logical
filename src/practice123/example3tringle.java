package practice123;

public class example3tringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i = 1; i < 5; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(+j+" ");
					
			}
			System.out.println("");
		}
		for (int i2 = 1; i2 < 5; i2++) {
			
			for (int j2 = 1; j2 <5-i2; j2++) {
				System.out.print(j2+" ");
			}
			System.out.println("");
		}
	}

}

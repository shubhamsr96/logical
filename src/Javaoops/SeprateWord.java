package Javaoops;

import java.util.Scanner;

public class SeprateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		 String str= s.nextLine();
		 
		 String[] str1 = str.split(" ");
		 
		 for(String w: str1) {
			 System.out.println(w);
	 }
		 
	

	}

}

package practice123;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class reversstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str= "hello i am shubham";
       Scanner sc = new Scanner(System.in);
       System.out.println("enter String:-");
       String str= sc.nextLine(); 
    		   
		String result = Arrays.asList(str.split(" ")).stream()
		          .map(s -> new StringBuilder(s).reverse())
		          .collect(Collectors.joining(" "));
		System.out.println(result);
	}
}
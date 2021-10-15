package practice123;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LowerTouppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str="shubham";
 // List<String> a =("shubham","singh","rajput");
  System.out.println(str.toUpperCase());
  //System.out.println(a.toString().toUpperCase());
  List<String> name = Arrays.asList("Nitya", "Naina", "Shubham", "Same", "Skill", "Niharika", "Sourabh");
  //System.out.println();
  List<String> li= Stream.of("shubham","singh","rajput").map(s->s.toUpperCase()).collect(Collectors.toList());
     System.out.println(li);
     System.out.println(li.get(0)+" "+li.get(1)+" "+li.get(2));
	}

}

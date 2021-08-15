package practice123;

import java.util.HashMap;
import java.util.Map;

public class Spacecount {
	public static void getspacecount(String name) {

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char strArray[] = name.toCharArray();

		for (char c : strArray) {
			if (String.valueOf(c).isEmpty()) {
				if (charMap.containsKey(c)) {
					charMap.put(c, charMap.get(c) + 1);
				} else {
					charMap.put(c, 1);

				}
			}
		}

		System.out.println(name + " : " + charMap);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		getspacecount("add the new  ");
	}

}

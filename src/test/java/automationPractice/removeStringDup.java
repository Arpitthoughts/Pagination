package automationPractice;

import java.util.HashSet;
import java.util.Set;

public class removeStringDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "java";
		StringBuilder sb1 = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {

			int ind = s.indexOf(s.charAt(i), i + 1);
			if (ind == -1) {
				sb1.append(s.charAt(i));
			}
		}

		System.out.println(sb1);

		
		
		//Approach 2
		StringBuilder sb2 = new StringBuilder();
		Set<Character> setStr = new HashSet<>();
		for (Character ch : s.toCharArray()) {
			setStr.add(ch);
		}
		for (Character ch : setStr) {
			sb2.append(ch);

		}
		System.out.println(sb2);

		// Approach 3
		StringBuilder sb3 = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {

			boolean repeated = false;
			for (int j = i + 1; j < s.length(); j++) {

				if (s.charAt(i) == s.charAt(j)) {
					repeated = true;
					break;
				}
			}

			if (!repeated) {
				sb3.append(s.charAt(i));
			}

		}
		System.out.println(sb3);
		
		
		//Approach 4
		StringBuilder sb4= new StringBuilder();
		s.chars().distinct().forEach(e->sb4.append((char)e));
		System.out.println(sb4);
	}

}

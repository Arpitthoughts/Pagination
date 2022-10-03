package automationPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arrNum = new Integer[] { 2, 3, 4, 2, 3, 7, 10 };
		Set<Integer> duplicates = new HashSet<Integer>();
		int count = 0;
		// 1st Method using Brute force
		for (int i = 0; i < arrNum.length; i++) {

			for (int j = i + 1; j < arrNum.length; j++) {
				if (arrNum[i] == arrNum[j]) {

					duplicates.add(arrNum[i]);
					break;
				}
			}

		}

		Iterator<Integer> it = duplicates.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Method 2 using hash set

		Set<Integer> data = new HashSet<Integer>();
		for (int i : arrNum) {
			if (data.add(i) == false) {
				System.out.println("duplicate element" + i);
			}
		}

		// Method 3 using HashMap

		Map<Integer, Integer> datamap = new HashMap<Integer, Integer>();

		for (int i : arrNum) {
			Integer countValue = datamap.get(i);
			if (countValue == null) {
				datamap.put(i, 1);

			} else {
				datamap.put(i, ++countValue);

			}
		}
		Set<Entry<Integer, Integer>> entrySet = datamap.entrySet();
		for (Entry<Integer, Integer> es : entrySet) {
			if (es.getValue() > 1) {
				System.out.println("Duplicate elements " + es.getKey());
			}
		}

		// Method 4 using Java streams
		Set<Integer> seData = new HashSet<Integer>();

		List<Integer> al = Arrays.asList(arrNum);

		Set<Integer> newSet = al.stream().filter(e -> !seData.add(e)).collect(Collectors.toSet());

		System.out.println(newSet);
		System.out.println(seData);

		Map<Integer, String> hm = new HashMap<>();
		hm.put(1, "Arpit");
		hm.put(2, "Aditya");
		hm.put(3, "Brijesh");

		Iterator<Entry<Integer, String>> itx = hm.entrySet().iterator();
		while (itx.hasNext()) {

			Entry<Integer, String> es = itx.next();

			System.out.println(es.getKey() + " " + es.getValue());
		}
		
		

	}
}

package automationPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> al =new ArrayList<Integer>();
		
		boolean x=al.add(10);
		al.add(20);
		System.out.println(x);
		
		List<Integer>alc= new ArrayList<>();
		int count =2;
		for(int i=0;i<5;i++) {
			
			alc.add(count);
			count++;
		}
		
		System.out.println(alc);
		
		boolean y=al.addAll(alc);
		
		System.out.println(al);
		System.out.println(y);
		
		LinkedList<Integer> link= new LinkedList<>();
		
		
	
	}

}

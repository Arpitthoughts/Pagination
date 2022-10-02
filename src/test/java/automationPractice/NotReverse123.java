package automationPractice;

public class NotReverse123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "My name is Arpit";
		String tobeinserted = "123";

		int indexit = name.indexOf("Arpit");

		System.out.println(indexit);

		String modified = name.substring(0, indexit) + tobeinserted + name.substring(indexit - 1);
		System.out.println(modified);
		StringBuilder sb=null;
		for (String s : modified.split(" ")) {
			 sb = new StringBuilder(s);
			System.out.print(sb.reverse()+ " ");
			
			

		}
		

	

	}
}
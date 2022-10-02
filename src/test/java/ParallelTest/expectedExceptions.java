package ParallelTest;

import org.testng.annotations.Test;

public class expectedExceptions {
	
	@Test(expectedExceptions= {ArithmeticException.class,ArrayIndexOutOfBoundsException.class})
	public void testMethod1() {
		
		int a=10;
		int c=4/0;
		int arr[]= {4,5,6};
		arr[6]=10;

		int b= 10/0;
		System.out.println("testMethod1");
		
	
		
	}
	
	//@Test
	public void testMethod2() {
		
		int a=10;
		int b= 10/0;
		System.out.println("testMethod2");
	}

}

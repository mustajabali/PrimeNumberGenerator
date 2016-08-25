/* == Prime Number Generator ==

Please provide us with a concise, highly efficient and robust prime number generator written by you (from scratch, in Java) that gives all prime numbers in the range between two numbers provided by the user (e.g. user gives 1 and 10 and you return "2, 3, 5, 7"). Please do not cheat on available code in the internet - we'd like to have your program with your ideas.

Please ...
2a) think about performance optimizations and enrich your program with multiple (at least 3) different prime number generation strategies with different performance optimizations. Optimally, you can prove each performance optimization by a shorter run time of your program (you can log this in a simple table).

2b) give the user the chance to select which prime number generation strategy should be chosen (via input)

2c) write JUnit tests that test 10 different user inputs (including wrong inputs)

Make your program be usable via the CLI. */
package Task1;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PrimeNumberGeneratorTest {
	private static final Logger LOGGER = Logger.getLogger(FirstPrimeNumberGenerator.class.getName());
	static Main main = null;

	@BeforeClass
	public static void setUp() {
		LOGGER.info("Before tests");
		main = new Main();
	}
	/**
	 * Test FirstPrimeGenerator from 1 to 10 input
	 */
	@Test
	public void FirstPG_1to10_Test() {
		IPrimeGenerator primeGenerator = new FirstPrimeNumberGenerator();
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(7);
		List<Integer> returnedList = primeGenerator.getPrimeNumbers(1, 10);
		assertEquals(returnedList, list);
	}
	
	/**
	 * Test FirstPrimeGenerator from 0 to 10 input
	 */
	@Test
	public void FirstPG_0to10_Test() {
		IPrimeGenerator primeGenerator = new FirstPrimeNumberGenerator();
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(7);
		List<Integer> returnedList = primeGenerator.getPrimeNumbers(1, 10);
		assertEquals(returnedList, list);
	}
	
	@Test
	public void FirstPG_2to5_Test() {
		IPrimeGenerator primeGenerator = new FirstPrimeNumberGenerator();
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		List<Integer> returnedList = primeGenerator.getPrimeNumbers(2, 5);
		assertEquals(returnedList,list);
	}
	
	/**
	 * Test FirstPrimeGenerator from 1 to 10 input
	 */
	@Test
	public void FirstPG_1to100_Test() {
		IPrimeGenerator primeGenerator = new FirstPrimeNumberGenerator();
		Integer[] oneTo100 = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
		List<Integer> list ;
		list = Arrays.asList(oneTo100);
		
		List<Integer> returnedList = primeGenerator.getPrimeNumbers(1, 100);
		assertEquals(returnedList,list);
	}
	/**
	 * Test FirstPrimeGenerator from 1 to 1000 input
	 */
	
	@Test
	public void FirstPG_1to1000_Test() {
		IPrimeGenerator primeGenerator = new FirstPrimeNumberGenerator();
		Integer[] oneTo1000 = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997};
		List<Integer> list ;
		list = Arrays.asList(oneTo1000);
		
		List<Integer> returnedList = primeGenerator.getPrimeNumbers(1, 1000);
		assertEquals(returnedList,list);
	}
	
	
	/**
	 * Test SecondPrimeNumberGenerator from 1 to 10 input
	 */
	@Test
	public void SecondPG_1to10_Test() {
		IPrimeGenerator primeGenerator = new ImprovedPrimeNumberGenerator();
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(7);
		List<Integer> returnedList = primeGenerator.getPrimeNumbers(1, 10);
		assertEquals(returnedList, list);
	}
	
	/**
	 * Test SecondPrimeNumberGenerator from 0 to 10 input
	 */
	@Test
	public void SecondPG_0to10_Test() {
		IPrimeGenerator primeGenerator = new ImprovedPrimeNumberGenerator();
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(7);
		List<Integer> returnedList = primeGenerator.getPrimeNumbers(1, 10);
		assertEquals(returnedList, list);
	}
	
	@Test
	public void SecondPG_2to5_Test() {
		IPrimeGenerator primeGenerator = new ImprovedPrimeNumberGenerator();
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		List<Integer> returnedList = primeGenerator.getPrimeNumbers(2, 5);
		assertEquals(returnedList,list);
	}
	
	/**
	 * Test SecondPrimeNumberGenerator from 1 to 10 input
	 */
	@Test
	public void SecondPG_1to100_Test() {
		IPrimeGenerator primeGenerator = new ImprovedPrimeNumberGenerator();
		Integer[] oneTo100 = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
		List<Integer> list ;
		list = Arrays.asList(oneTo100);
		
		List<Integer> returnedList = primeGenerator.getPrimeNumbers(1, 100);
		assertEquals(returnedList,list);
	}
	
	/**
	 * Test SecondPrimeGenerator from 1 to 1000 input
	 */
	
	@Test
	public void SeondPG_1to1000_Test() {
		IPrimeGenerator primeGenerator = new ImprovedPrimeNumberGenerator();
		Integer[] oneTo1000 = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997};
		List<Integer> list ;
		list = Arrays.asList(oneTo1000);
		
		List<Integer> returnedList = primeGenerator.getPrimeNumbers(1, 1000);
		assertEquals(returnedList,list);
	}
	
	/**
	 * Test ThirdPrimeNumberGenerator from 1 to 10 input
	 */
	@Test
	public void ThirdPG_1to10_Test() {
		IPrimeGenerator primeGenerator = new BestPrimeNumberGenerator();
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(7);
		List<Integer> returnedList = primeGenerator.getPrimeNumbers(1, 10);
		assertEquals(returnedList, list);
	}
	
	/**
	 * Test ThirdPrimeNumberGenerator from 0 to 10 input
	 */
	@Test
	public void ThirdPG_0to10_Test() {
		IPrimeGenerator primeGenerator = new BestPrimeNumberGenerator();
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(7);
		List<Integer> returnedList = primeGenerator.getPrimeNumbers(1, 10);
		assertEquals(returnedList, list);
	}
	
	@Test
	public void ThirdPG_2to5_Test() {
		IPrimeGenerator primeGenerator = new BestPrimeNumberGenerator();
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		List<Integer> returnedList = primeGenerator.getPrimeNumbers(2, 5);
		assertEquals(returnedList,list);
	}
	
	/**
	 * Test ThirdPrimeNumberGenerator from 1 to 10 input
	 */
	@Test
	public void ThirdPG_1to100_Test() {
		IPrimeGenerator primeGenerator = new BestPrimeNumberGenerator();
		Integer[] oneTo100 = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
		List<Integer> list ;
		list = Arrays.asList(oneTo100);
		
		List<Integer> returnedList = primeGenerator.getPrimeNumbers(1, 100);
		assertEquals(returnedList,list);
	}
	
	/**
	 * Test ThirdPrimeGenerator from 1 to 1000 input
	 */
	
	@Test
	public void ThirdPG_1to1000_Test() {
		IPrimeGenerator primeGenerator = new BestPrimeNumberGenerator();
		Integer[] oneTo1000 = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997};
		List<Integer> list ;
		list = Arrays.asList(oneTo1000);
		
		List<Integer> returnedList = primeGenerator.getPrimeNumbers(1, 1000);
		assertEquals(returnedList,list);
	}
	
	@AfterClass
	public static void tearDown() {
		LOGGER.info("After tests");
		main = null;
	}
	

}

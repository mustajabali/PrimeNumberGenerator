/* == Prime Number Generator ==

Please provide us with a concise, highly efficient and robust prime number generator written by you (from scratch, in Java) that gives all prime numbers in the range between two numbers provided by the user (e.g. user gives 1 and 10 and you return "2, 3, 5, 7"). Please do not cheat on available code in the internet - we'd like to have your program with your ideas.

Please ...
2a) think about performance optimizations and enrich your program with multiple (at least 3) different prime number generation strategies with different performance optimizations. Optimally, you can prove each performance optimization by a shorter run time of your program (you can log this in a simple table).

2b) give the user the chance to select which prime number generation strategy should be chosen (via input)

2c) write JUnit tests that test 10 different user inputs (including wrong inputs)

Make your program be usable via the CLI. */

package Task1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {
	private static final Logger LOGGER = Logger.getLogger(FirstPrimeNumberGenerator.class.getName());

	public static void main(String[] args) {
		programRunner();
	}
	
	
	/**
	 * 
	 */
	public static void programRunner() {
		int nums[] = getTwoNumbers();
		int num1 = nums[0];
		int num2 = nums[1];
		
		IPrimeGenerator primeGenerator = selectPrimeGenerator();
		
		long startTime = System.currentTimeMillis();
		List<Integer> list = (ArrayList<Integer>) primeGenerator.getPrimeNumbers(num1, num2);
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		
		LOGGER.info(list.toString());
		LOGGER.info("Elpased Time (ms): "+elapsedTime);
		LOGGER.info("Length of List: "+ list.size());
	}
	
	
	/**
	 * 
	 * @return
	 */
	public static IPrimeGenerator selectPrimeGenerator() {
		int option = 0;
		LOGGER.info("Select prime number generator from 1 to 3: ");
		IPrimeGenerator primeGenerator = null;
		do {
			option = getIntInput();
			switch (option) {
				case 1: primeGenerator = new FirstPrimeNumberGenerator();
						break;
				case 2: primeGenerator = new ImprovedPrimeNumberGenerator();
						break;
				case 3: primeGenerator = new BestPrimeNumberGenerator();
						break;
				default: LOGGER.warning("Select prime number generator from 1 to 3: ");
			}
		} while ( !(option == 1 || option == 2 || option == 3) );
		
		return primeGenerator;
	}
	/**
	 * 
	 * @return
	 */
	public static int[] getTwoNumbers() {
		int num1 = 0;
		int num2 = 0;
		do {
			LOGGER.info("Enter a number greater than zero: ");
			num1 = getIntInput();
			LOGGER.info("Enter a number greater than 1st number: ");
			num2 = getIntInput();
			LOGGER.info("number1 ->"+ num1 + ", number2 =>"+ num2);
			
			if (num1 >= num2) {
				LOGGER.warning("Second number should be greater than first number.");
			}
		} while (num1 > num2);
		
		int[] numbers = new int[2];
		numbers[0] = num1;
		numbers[1] = num2;
		
		return numbers;
	}
	
	/**
	 * 
	 * @return
	 */
	public static int getIntInput() {
		int number = 0;
		do {
			String input = null;
		    try {
		        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		        input = bufferedReader.readLine();
		        number = Integer.parseInt(input);
		    } catch (NumberFormatException ex) {
		    	LOGGER.warning("Not a number !");
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		} while (number == 0);
		
	    return number;
	}

}

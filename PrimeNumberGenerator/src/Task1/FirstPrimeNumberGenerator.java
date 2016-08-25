package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class FirstPrimeNumberGenerator implements IPrimeGenerator {
	private static final Logger LOGGER = Logger.getLogger(FirstPrimeNumberGenerator.class.getName());
	
	/* (non-Javadoc)
	 * 
	 * @see Task1.IPrimeGenerator#getPrimeNumbers(int, int)
	 * Checks the Number for Prime from 2 to Number/2
	 */
	@Override
	public List<Integer> getPrimeNumbers(int num1, int num2) {
		LOGGER.info("First Prime Number Generator Selected");
		//Prime number is a number only divisible by itself and 1
		int checkPrime = num1 + 1;
		List<Integer> list = new ArrayList<>();
		while (checkPrime < num2) {
			boolean isPrime = true;
			//Since divisor of a number will be smaller or equal to half
			int tmp = checkPrime/2;
			
			for (int i = tmp; i>=2; i--) {
				if (checkPrime % i == 0 ) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				list.add(checkPrime);
			}
			checkPrime = checkPrime + 1;
		}
		return list;
	}

}

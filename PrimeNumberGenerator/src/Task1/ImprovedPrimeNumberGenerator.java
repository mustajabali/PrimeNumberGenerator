package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ImprovedPrimeNumberGenerator implements IPrimeGenerator{
	private static final Logger LOGGER = Logger.getLogger(FirstPrimeNumberGenerator.class.getName());

	/* (non-Javadoc)
	 * @see Task1.IPrimeGenerator#getPrimeNumbers(int, int)
	 * 
	 * Checks the Number for Prime from 3 to Number/2 
	 * and
	 * Excludes even number numbers if number is not divisible by 2
	 */
	@Override
	public List<Integer> getPrimeNumbers(int num1, int num2) {
		LOGGER.info("Second Prime Number Generator Selected");
		//Prime number is a number only divisible by itself and 1
				int checkPrime = num1 + 1;
				List<Integer> list = new ArrayList<Integer>();
				while (checkPrime < num2) {
					boolean isPrime = true;
					//Since divisor of a number will be smaller or equal to half
					int tmp = (int) Math.floor(checkPrime/2);
					//Check for divisibility by 2
					if (! (checkPrime % 2 == 0) ) {
						//Skipping even number is not divisible by 2
						for (int i = 3; i<tmp; i=i+2) {
							if (checkPrime % i == 0 ) {
								isPrime = false;
								break;
							}
						}
					} else if (checkPrime == 2) {
						isPrime = true;
					} else {
						isPrime = false;
					}
					if (isPrime) {
						list.add(checkPrime);
					}
					checkPrime = checkPrime + 1;
				}
				return list;
	}

}

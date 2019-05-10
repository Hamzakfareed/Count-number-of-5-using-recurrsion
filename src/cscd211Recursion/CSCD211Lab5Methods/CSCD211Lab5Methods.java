package cscd211Recursion.CSCD211Lab5Methods;

public class CSCD211Lab5Methods {

	public static int count5s(int number) {
		if (number < 10) {
			// if the number is less than 10, return if the digit is present,
			// and don't recurse any deeper
			return number == 5 ? 1 : 0;
		} else {
			// if the right-most digit is correct
			if (number % 10 == 5) {
				// return 1 + the value from the remaining digits (recursion)
				return 1 + count5s(number / 10);
			} else {
				// else just return the value from the remaining digits
				// (recursion)
				return count5s(number / 10);
			}
		}
	}

}

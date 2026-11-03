package leet.problem;

public class AddBinary {

	public String addBinary(String a, String b) {
		char[] aReverse = new StringBuilder(a).reverse().toString().toCharArray();
		char[] bReverse = new StringBuilder(b).reverse().toString().toCharArray();

		int longest = Math.max(aReverse.length, bReverse.length);

		char[] result = new char[longest + 1];

		// 48 0
		// 49 1

		int carry = 0;

		for (int i = 0; i < longest; i++) {
			int a_ = i < aReverse.length ? aReverse[i] - 48 : 0;
			int b_ = i < bReverse.length ? bReverse[i] - 48 : 0;

			int c_ = a_ + b_ + carry;

			result[i] = ((char) ((c_ % 2) + 48));
			carry = c_ > 1 ? 1 : 0;
		}

		if (carry == 1) {
			result[longest] = 49;
		}
		int resultLength = carry == 1 ? longest + 1 : longest;
		return new StringBuilder(String.valueOf(result, 0, resultLength)).reverse().toString();
	}

}

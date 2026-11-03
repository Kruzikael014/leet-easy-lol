package leet.problem;

import java.util.stream.IntStream;

public class PlusOne {

	public Long intArrConverter(int[] digits) {
		String a = "";

		for (int d : digits) {
			a += d;
		}

		System.out.println(Integer.MAX_VALUE);

		return Long.parseLong(a);
	}

	public int[] intConverter(int digits) {
		String s = String.valueOf(digits);

		int res[] = new int[s.length()];

		int idx = 0;
		for (char c : s.toCharArray()) {
			res[idx++] = c - 48;
		}
		return res;
	}

	public void printArr(int[] test) {
		System.out.print("[");
		System.out.print(test[0] + ", ");
		for (int i = 1; i < test.length; i++) {
			System.out.print(test[i] + ", ");
		}
		System.out.println("]");
	}

	public int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] == 9) {
				digits[i] -= 9;
			} else {
				digits[i]++;
				return digits;
			}
		}
		return IntStream.concat(IntStream.of(1), IntStream.of(digits)).toArray();
	}

}

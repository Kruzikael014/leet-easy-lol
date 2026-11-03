package leet.problem;

public class ReverseBits {

	public int reverseBits(int n) {
		return Integer.parseInt(
				new StringBuilder(String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0').replace(' ', '0'))
						.reverse().toString(),
				2);
	}
}

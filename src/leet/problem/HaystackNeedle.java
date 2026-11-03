package leet.problem;

public class HaystackNeedle {

	public int strStr(String hayStack, String needle) {
		if (hayStack.length() < needle.length())
			return -1;

		for (int i = 0; hayStack.length() - i >= needle.length(); i++) {
			if (hayStack.substring(i, i+needle.length()).equals(needle)) {
				return i;
			}
		}
		return -1;
	}

}

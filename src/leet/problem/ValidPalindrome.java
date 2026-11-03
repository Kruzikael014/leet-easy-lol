package leet.problem;

public class ValidPalindrome {

	public String sanitize(String s) {
		return s.chars().filter(e -> Character.isAlphabetic(e) || Character.isDigit(e))
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString()
				.toLowerCase();
	}

	public boolean isPalindrome(String s) {
		var sanitized = sanitize(s);
		var sanitized_reversed = new StringBuilder(sanitized).reverse().toString();

		System.out.println(sanitized);
		System.out.println(sanitized_reversed);

		if (sanitized.equals(sanitized_reversed)) {
			return true;
		}
		return false;
	}
}

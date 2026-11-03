package leet.problem;

public class ExcelSheetColumnNumber {
	public int titleToNumber(String columnTitle) {
		int res = 0;
		int l = columnTitle.length();
		var pow = l - 1;
		for (char a : columnTitle.toCharArray()) {
			var normalizedA = ((int) a) - 64;
			res += normalizedA * (Math.pow(26, pow));
			pow--;
		}
		return res;
	}
}

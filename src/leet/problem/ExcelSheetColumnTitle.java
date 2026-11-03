package leet.problem;

public class ExcelSheetColumnTitle {

	public String convertToTitle(int columnNumber) {
		StringBuilder sb = new StringBuilder();
		while (columnNumber > 0) {
			columnNumber--; // geser ke 0-based
			sb.append((char) ('A' + columnNumber % 26)); // ambil huruf paling kanan
			columnNumber /= 26;
		}
		return sb.reverse().toString();
	}
}

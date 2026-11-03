package leet.problem;

import java.util.Vector;

public class ZigZagConversion {
	public int elementCount(Character[] t) {
		int cnt = 0;
		for (Character c : t) {
			if (c != null)
				cnt++;
		}
		return cnt;
	}

	public String convert(String s, int numRows) {
		if (numRows > s.length() || numRows == 1)
			return s;

		Vector<Character[]> zigs = new Vector<Character[]>();

		Character[] temp = new Character[numRows];
		int direction = 1;
		int curr = 0;
		for (Character c : s.toCharArray()) {
			// place
			temp[curr] = c;

			// decide where to
			if (direction == 1 && elementCount(temp) == numRows) {
				// store and move right
				zigs.add(temp);
				temp = new Character[numRows];
				direction *= -1;
			} else if (direction == -1) {

				// only change direction when
				if (curr == 0) {
					direction *= -1;
				} else {
					// always move right, right after 1 char placed
					zigs.add(temp);
					temp = new Character[numRows];
				}
			}

			// move
			curr += direction;
		}

		// make sure all stored even tho its element < numRows
		if (elementCount(temp) != 0) {
			zigs.add(temp);
		}

		String res = "";

		for (int i = 0; i < numRows; i++) {
			for (Character[] t : zigs) {
				if (t[i] != null) {
					res += t[i];
				}
			}
		}

		return res;
	}

}

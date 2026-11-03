package leet.problem;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();

		for (int i = 0; i < numRows; i++) {

			int size = i + 1;
			var row = new ArrayList<Integer>(size);

			if (i <= 1 /* && numRows <= 2 */ ) {
				for (int j = 0; j < size; j++) {
					row.add(1);
				}
			} else {
				var before = res.get(i - 1);

				for (int j = 0; j < size; j++) {
					if (j == 0) {
						row.add(before.get(0));
					} else if (j == size - 1) {
						row.add(before.get(before.size() - 1));
					} else {
						row.add(before.get(j - 1) + before.get(j));
					}
				}
			}
			res.add(row);
		}
		System.out.println(res.toString());
		return res;
	}
}

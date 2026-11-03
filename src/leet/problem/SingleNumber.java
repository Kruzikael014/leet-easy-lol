package leet.problem;

import java.util.Vector;

public class SingleNumber {

	public int singleNumber(int[] nums) {
		Vector<Integer> seen = new Vector<Integer>();
		for (int i = 0; i < nums.length; i++) {
			var intObj = Integer.valueOf(nums[i]);
			if (seen.contains(intObj)) {
				seen.remove(intObj);
				continue;
			}
			seen.add(nums[i]);
		}
		return seen.firstElement();
	}
}

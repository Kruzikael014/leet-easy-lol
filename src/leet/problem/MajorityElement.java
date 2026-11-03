package leet.problem;

import java.util.HashMap;

public class MajorityElement {

	public int majorityElement(int[] nums) {
		HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			var intObj = new Integer(nums[i]);
			if (!countMap.containsKey(intObj)) {
				countMap.put(intObj, 0);
			}
			int cnt = countMap.get(intObj) + 1;
			if (cnt > nums.length / 2)
				return nums[i];
			countMap.put(intObj, cnt);
		}
		// sort desc and get first
		var res = countMap.entrySet().stream().sorted((a, b) -> a.getValue() - b.getValue()).findFirst().get();
		System.out.println(res.getKey());
		return res.getKey();
	}
}

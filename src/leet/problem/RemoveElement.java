package leet.problem;

public class RemoveElement {

	public int removeElement(int[] nums, int val) {
		int safeIdx = 1;

		int cnt = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[safeIdx++ - 1] = nums[i];
				cnt++;
			}
		}
		
		return cnt;
	}

}

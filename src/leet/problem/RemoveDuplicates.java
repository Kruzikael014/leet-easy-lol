package leet.problem;

public class RemoveDuplicates {

	public int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;

		int uniqueUntil = 1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != nums[uniqueUntil - 1]) {
				nums[uniqueUntil++] = nums[i];
			}
		}	
//		for (int i : nums) {
//			System.out.println(i);
//		}
		return uniqueUntil;
	}

}

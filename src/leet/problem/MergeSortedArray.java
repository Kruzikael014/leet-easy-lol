package leet.problem;

public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int p1 = m - 1;
		int p2 = n - 1;
		for (int i = m + n - 1; i >= 0; i--) {
			if (p1 == -1 || p2 == -1)
				break;
			System.out.println("a");
			if (nums1[i] == 0 && nums2[p2] >= nums1[p1]) {
				nums1[i] = nums2[p2];
				nums2[p2--] = 0;
			} else if (nums1[p1] > nums2[p2]) {
				nums1[i] = nums1[p1];
				nums1[p1--] = 0;
			}
		}
		while (p2 >= 0) {
			nums1[p2] = nums2[p2--];
		}
	}
}

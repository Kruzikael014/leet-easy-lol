package leet.problem;

public class NumberOfOneBits {
	public int hammingWeight(int n) {
		var cnt = 0;
		for (int i = 30; i >= 0 && n != 0; i--) {
			var t = (int) Math.pow(2, i);
//			System.out.println("i = " + i + ", n = " + n + ", t = " + t);
			if (t <= n) {
//				System.out.println("decreasing " + t);
				cnt++;
				n -= t;
//				System.out.println("so n = " + n);
			}
		}
		return cnt;
	}
}

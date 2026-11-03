package leet.problem;

public class ClimbStairs {

	int memo[] = new int[50];

	int fibonacci(int n) {
		if (memo[n] != 0)
			return memo[n];
		if (n == 1)
			return 1;
		if (n <= 0)
			return 0;
		var res = fibonacci(n - 2) + fibonacci(n - 1);
		memo[n] = res;
		return res;
	}

	public int climbStairs(int n) {
		return fibonacci(n + 1);
	}

}

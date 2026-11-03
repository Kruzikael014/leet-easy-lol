package leet.problem;

import java.util.ArrayList;
import java.util.Comparator;

public class BestTimeToBuy {

	public int maxProfit(int[] prices) {
		ArrayList<Integer> profit = new ArrayList<Integer>();
		int min = Integer.MAX_VALUE;
		profit.add(0);
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] <= min) {
				min = prices[i];
			}
			if (prices[i] - min > profit.get(profit.size() - 1)) {
				profit.add(prices[i] - min);
			}
		}
		profit.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}

		});
		return profit.get(0);
	}
}

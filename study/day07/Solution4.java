package study.day07;

import java.util.*;

class Solution4 {
	public int[] solution(int n) {
		ArrayList<Integer> answer = new ArrayList<>();
		while (n != 1) {
			if (n % 2 == 0) {
				answer.add(n);
				n /= 2;
			} else if (n % 2 == 1) {
				answer.add(n);
				n = 3 * n + 1;
			}
		}
		answer.add(n);
		return answer.stream().mapToInt(i -> i.intValue()).toArray();
	}
}
package study.day09;

import java.util.*;

class Solution1 {
	public int[] solution(String[] intStrs, int k, int s, int l) {
		int[] answer = Arrays.stream(intStrs).mapToInt(i -> Integer.parseInt(i.substring(s, s + l))).filter(i -> i > k)
				.toArray();
		return answer;
	}
}
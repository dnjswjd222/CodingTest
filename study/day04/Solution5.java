package study.day04;

public class Solution5 {
	public int solution(int a, int b, boolean flag) {
		int answer = 0;
		answer = flag ? a + b : a - b;
		return answer;
	}
}
